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
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class DesignSceneController implements Initializable {

    @FXML
    private TextField designnCodeTextField;
    @FXML
    private TextField DesignByTextField;
    @FXML
    private TextField PriceTextField;
    @FXML
    private DatePicker ReGDateDatePicker;
    @FXML
    private Button addDesignButtonOnClick;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backToDCButtonOnClick(ActionEvent event) throws IOException {
        
                    Parent Parent = FXMLLoader.load(getClass().getResource("DecorationManagementScene.fxml"));
                    Scene EventCoordinatorScene = new Scene(Parent);
                    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    window.setScene(EventCoordinatorScene);
                    window.show();
        
    }
    
}
