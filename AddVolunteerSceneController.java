/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package weddingplanner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class AddVolunteerSceneController implements Initializable {

    @FXML    private TextField idTextField;
    @FXML    private TextField nameTextField;
    @FXML    private ComboBox<String> groupComboBox;
    @FXML    private ComboBox<String> deptartmentComboBox;
    @FXML    private DatePicker dobDatePicker;
    @FXML    private DatePicker dojDatePicker;
    @FXML    private TextField salaryTextField;
    @FXML
    private TextArea outputTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        groupComboBox.getItems().addAll
        (
                "Group-A",
                "Group-B",
                "Group-C",
                "Group-D"
        );
        deptartmentComboBox.getItems().addAll
        (
                "Food",
                "Decor",
                "Entrance",
                "Guest Management",
                "Designer"
        );
        
        // TODO
    }    

    @FXML
    private void addNewVolunteerButtonOnClick(ActionEvent event) {
        
        
        
        
        
        Boolean addStatus = 
                EventCoordinator.addnewVolunteer(
                        Integer.parseInt(idTextField.getText()), 
                        nameTextField.getText(), 
                        dobDatePicker.getValue(), 
                        dojDatePicker.getValue(), 
                        groupComboBox.getValue(), 
                        deptartmentComboBox.getValue(),
                        Float.parseFloat(salaryTextField.getText())
                );
        if(addStatus)
        {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("New Volunteer is added successfully.");
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
    private void loadVolunteerListButtonOnClick(ActionEvent event) throws FileNotFoundException, IOException, ClassNotFoundException {
        //outputTextArea.clear();
        outputTextArea.setText(" ");
        
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        fis = new FileInputStream("Volunteer.bin");
        ois = new ObjectInputStream(fis);
        Volunteer tempVolunteer;
        while(true){
            tempVolunteer = (Volunteer)ois.readObject();
            outputTextArea.appendText(tempVolunteer.toString());
            System.out.println(tempVolunteer.toString());

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
