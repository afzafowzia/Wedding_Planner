/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package weddingplanner;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class ContactInfoSceneController implements Initializable {

    @FXML
    private TextArea ContactusTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ContactusTextArea.setText("");
        ContactusTextArea.setEditable(false);
        ContactusTextArea.appendText
        ("Contact Us At zephyrusshadowfall@gmail.com\n"
        + "Contact no - +880 1937-958189");
        // TODO
    }    

    @FXML
    private void backToLogInScene(ActionEvent event) throws IOException {
        
        Parent Parent = FXMLLoader.load(getClass().getResource("LogInScene.fxml"));
        Scene EventCoordinatorScene = new Scene(Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(EventCoordinatorScene);
        window.show();
    }
    
}
