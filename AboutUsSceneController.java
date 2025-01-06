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
public class AboutUsSceneController implements Initializable {

    @FXML
    private TextArea aboutUsTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        aboutUsTextArea.setText("");
        aboutUsTextArea.setEditable(false);
        aboutUsTextArea.appendText
        ( "At The Artists,we understand that your wedding dayis a culmination of dreams,\n"
        + "love, and meticulous planning. As seasoned wedding planners, we take pride\n"
        + "in transforming your vision into an unforgettable reality. Our mission is \n"
        + "simple—to create weddings that are a true reflection of your love story.\n"
        + "We pour our hearts into crafting seamless experiences that capture the \n"
        + "essence of your journey together."
        );
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
