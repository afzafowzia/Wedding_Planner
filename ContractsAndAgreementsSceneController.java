/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package weddingplanner;

import java.io.IOException;
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
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author rafia
 */
public class ContractsAndAgreementsSceneController implements Initializable {

    @FXML
    private ComboBox<?> eventCombobox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void agreeRadioButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void notAgreeRadioButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void submitButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void PreviousButtonOnClick(ActionEvent event) {
        try {
        Parent parent = FXMLLoader.load(getClass().getResource("VenueManager.fxml"));
        Scene newScene = new Scene(parent);
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(newScene);
    }   catch (IOException ex) {
        Logger.getLogger(VenueManagerController.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
}
