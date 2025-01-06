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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class AddNewDesignerSceneController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField IdTextField;
    @FXML
    private TextField ContactTextField;
    @FXML
    private TextField EmailTextField;
    @FXML
    private DatePicker DOBdatePicker;
    @FXML
    private DatePicker DoJDatePicker;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AddButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void backToDMScene(ActionEvent event) throws IOException {
        
        Parent Parent = FXMLLoader.load(getClass().getResource("DecorationManagementScene.fxml"));
        Scene EventCoordinatorScene = new Scene(Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(EventCoordinatorScene);
        window.show();
        
    }
    
}
