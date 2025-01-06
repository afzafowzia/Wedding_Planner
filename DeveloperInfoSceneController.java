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
public class DeveloperInfoSceneController implements Initializable {

    @FXML
    private TextArea developerTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        developerTextArea.setText("");
        developerTextArea.setEditable(false);
        developerTextArea.appendText("Developper 1 - Kaushik Dey Joy\n"
                + "Developper 2 - Rafi Al Adnan\n"
                + "Developper 3 - Mahima Rahman Waishee\n"
                + "Developper 4 - Afza Noor Fowzia");
        // TODO
    }    

    @FXML
    private void backTologInSceneButtonOnClick(ActionEvent event) throws IOException {
        
        Parent Parent = FXMLLoader.load(getClass().getResource("LogInScene.fxml"));
        Scene EventCoordinatorScene = new Scene(Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(EventCoordinatorScene);
        window.show();
    }
    
}
