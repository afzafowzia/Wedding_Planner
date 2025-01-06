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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author X-WAY
 */
public class FXML_CM_handlingLeftoverFood_sceneController implements Initializable {

    @FXML
    private TextArea view_agent_text_area;
    @FXML
    private TextField event_id_text_field;
    @FXML
    private TextArea comment_text_area;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        String info = "Agent ID: 1\nName: abcd\nEmail: aaaaa@gmai.com\nContact: 01234234234\n";
        info += "Agent ID: 2\nName: bbb\nEmail: aaaaa@gmai.com\nContact: 01234234234\n";
        info += "Agent ID: 3\nName: ccc\nEmail: aaaaa@gmai.com\nContact: 01234234234\n";
        
        view_agent_text_area.setText(info);
    }    

    @FXML
    private void OnClickSubmitButton(ActionEvent event) {
        int event_id = Integer.parseInt(event_id_text_field.getText());
        String comment = comment_text_area.getText();
        
        FoodDonation m = new FoodDonation(event_id, comment);
        m.addFoodDonation();
        
        event_id_text_field.setText(null);
        comment_text_area.setText(null);
    }

    @FXML
    private void OnClickBackButton(ActionEvent event) throws IOException {
        FXMLLoader loader2 = new FXMLLoader();
        loader2.setLocation(getClass().getResource("FXML_CM_home_scene.fxml"));
        Parent homeScene2 = loader2.load();
        Scene homepage2 = new Scene(homeScene2);
        FXML_CM_home_sceneController controller2 = loader2.getController();
        Stage window2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        window2.setScene(homepage2);
        window2.show();
    }
    
}
