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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Start
 */
public class ClientController implements Initializable {

    @FXML
    private ComboBox<String> selectToRemoveClientCombobox;
    @FXML
    private Label updateClientNameLabel;
    @FXML
    private ComboBox<String> seeClientDetailsCombobox;
    @FXML
    private TextField newClientNameTextArea;
    @FXML
    private TextField ClientLocationTextArea;
    @FXML
    private TextArea outputTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addClientButtonOnClick(ActionEvent event) {
         Boolean giveStatus =
                Client.addclient(
                newClientNameTextArea.getText(),
                 ClientLocationTextArea.getText()
                );
        if(giveStatus)
            {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("New Client Is Added.");
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
    private void removeClientButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void seeClientDetailsSelectionCombobox(ActionEvent event) {
    }

    @FXML
    private void showClientListbuttonOnclick(ActionEvent event)throws FileNotFoundException, IOException, ClassNotFoundException {
        outputTextArea.setText("\n");
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        try {
            f = new File("Client.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            NewRegistration reg;
            try{
                outputTextArea.setText("\n");
                while(true){
                    System.out.println("Printing objects.");
                    reg = (NewRegistration)ois.readObject();
                  
                    
                    System.out.println(reg.toString());
                    outputTextArea.appendText(reg.toString());
                }
            }
            catch(Exception e){
                //
            }//nested catch     
            outputTextArea.appendText("\n This IS The New Client\n");            
        } catch (IOException ex) { } 
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }           
    }

    

    @FXML
    private void backButtonOnClick(ActionEvent event) {
        try {
        Parent parent = FXMLLoader.load(getClass().getResource("MainManagerDashboard.fxml"));
        Scene newScene = new Scene(parent);
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(newScene);
    }   catch (IOException ex) {
        Logger.getLogger(MainManagerDashboardController.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    @FXML
    private void viewNewRegisteredPeopleButtonOnClick(ActionEvent event) {
         try {
            Parent dashboardParent = FXMLLoader.load(getClass().getResource("ViewNewRegisteredPeople.fxml"));
            Scene dashboardScene = new Scene(dashboardParent);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(dashboardScene);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(MainManagerDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
