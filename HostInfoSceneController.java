/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package weddingplanner;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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
public class HostInfoSceneController implements Initializable {

    @FXML
    private TextField hostNameTectFiels;
    @FXML
    private TextField contactTextFiels;
    @FXML
    private TextField emailTextField;
    @FXML
    private DatePicker EventDatePicker;
    @FXML
    private TableView<Host> thostTableView;
    @FXML
    private TableColumn<Host, String> hostNameTableColumn;
    @FXML
    private TableColumn<Host, String> eventDateTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        hostNameTableColumn.setCellValueFactory(new PropertyValueFactory<Host,String>("name"));
        eventDateTableColumn.setCellValueFactory(new PropertyValueFactory<Host,String>("doe"));
        // TODO
    }    

    @FXML
    private void BookHostButtonOnClick(ActionEvent event) throws IOException {
        
        
        Boolean addStatus = 
                EventCoordinator.addnewHost(
                        
                        hostNameTectFiels.getText(),
                        contactTextFiels.getText(),
                        emailTextField.getText(),
                        EventDatePicker.getValue() 
                       
                );
        if(addStatus)
        {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("New Host is added successfully.");
            a.showAndWait();
        }
        else
        {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Oops! Something went wrong. \nTry later...");
            a.showAndWait();
        } 
        
                    
        FileInputStream fis = null;
        ObjectInputStream ois=null;
        try {

            fis = new FileInputStream("Host.bin");
            ois = new ObjectInputStream(fis);
            Host tempHost;

            while(true){          

                    
                    tempHost = (Host)ois.readObject();
                    tempHost.getName();
                    tempHost.getDoe();
                    thostTableView.getItems().addAll(
                            new Host(
                                   
                            )
                    );
                  

                    

                
            } //end while
        }
        catch(Exception e){
            try {
                if(ois!=null)
                    ois.close();
            } catch (IOException ex) {
                Logger.getLogger(HostInfoSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
   

    @FXML
    private void backToECSceneButtonOnClick(ActionEvent event) throws IOException {
        
        Parent Parent = FXMLLoader.load(getClass().getResource("EventCoordinatorScene.fxml"));
        Scene EventCoordinatorScene = new Scene(Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(EventCoordinatorScene);
        window.show();
    }
    
    
    
    
}
