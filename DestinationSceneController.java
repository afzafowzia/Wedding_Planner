/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package weddingplanner;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class DestinationSceneController implements Initializable {

    @FXML
    private DatePicker dateSelectDatePicker;
    @FXML
    private TextField contactTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private TableView<DestintionClass> registeredTableView;
    @FXML
    private TableColumn<DestintionClass, String> destinationTableColumn;
    @FXML
    private TableColumn<DestintionClass, String> contactTableColumn;
    @FXML
    private TableColumn<DestintionClass, String> nameTabeCloumn;
    @FXML
    private TableColumn<DestintionClass, String> dateTableColumn;
    @FXML
    private ComboBox<String> destinationSelectionComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        destinationSelectionComboBox.getItems().addAll(
                "Bali-Indonesia",
                "Maui-Hawaii",
                "Paris-France",
                "Riviera Maya-Mexico");
        
        destinationTableColumn.setCellValueFactory(new PropertyValueFactory<DestintionClass,String>("destination"));
        contactTableColumn.setCellValueFactory(new PropertyValueFactory<DestintionClass,String>("contact"));        
        nameTabeCloumn.setCellValueFactory(new PropertyValueFactory<DestintionClass,String>("name"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<DestintionClass,String>("doEvent"));           
        
        // TODO
    }    

    @FXML
    private void RegisterButtonOnClick(ActionEvent event) {

        Boolean addStatus = 
                EventCoordinator.addnewDestination(
                        
                        destinationSelectionComboBox.getValue(),    
                        contactTextField.getText(),        
                        nameTextField.getText(),
                        dateSelectDatePicker.getValue()
                       
                );
        if(addStatus)
        {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("New Client is added successfully.");
            a.showAndWait();
        }
        else
        {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Oops! Something went wrong. \nTry later...");
            a.showAndWait();
        }          
    }

    @FXML
    private void backToECSceneButtonOnClick1(ActionEvent event) throws IOException {
        
        Parent Parent = FXMLLoader.load(getClass().getResource("EventCoordinatorScene.fxml"));
        Scene EventCoordinatorScene = new Scene(Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(EventCoordinatorScene);
        window.show();
    }

    @FXML
    private void loadTableButtonOnClick1(ActionEvent event) {
       String tempdest = null;
       String tempcontact = null;
       String tempName = null;
       LocalDate tempDate = null;
       
        try{

            
            ObjectInputStream ois = null;
            DestintionClass tempDestination = null;
            
                   
         
                ois = new ObjectInputStream(
                            new FileInputStream(
                                    "Destination.bin"
                            
                            )
                    
                    );
                while(true){
                   tempDestination = (DestintionClass)ois.readObject();

                   tempdest = tempDestination.getDestination();
                   tempcontact = tempDestination.getContact();
                   tempName = tempDestination.getName();
                   tempDate = tempDestination.getDoEvent();



                }

            
        
        
        } //try
        
        catch(Exception e){

            //registeredTableView.getColumns().setAll(destinationTableColumn,contactTableColumn,nameTabeCloumn,dateTableColumn);
           registeredTableView.getItems().addAll(
                        new DestintionClass(
                                tempdest,
                                tempcontact,
                                tempName,
                                tempDate

                        )                     
                     );             
            
                         

                                    
            

               
               
            }//End Of Catch        
    }
    
    
}
