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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class FXML_AudioVisualEquipmentSceneController implements Initializable {

    @FXML
    private TextArea view_equipment_text_area;
    @FXML
    private TextField event_id_text_field;
    @FXML
    private TextArea equipment_info_text_area;
    @FXML
    private DatePicker event_date;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        String equipments = "Equipment ID: 1\nName: abcd\nHire Price:4,000\n";
        equipments += "Equipment ID: 2\nName: bbb\nHire Price:2,000\n";
        equipments += "Equipment ID: 3\nName: ccc\nHire Price:3,000\n";
        
        view_equipment_text_area.setText(equipments);
    }

    @FXML
    private void OnClickSubmitButton(ActionEvent event) {
        AudioVisualEquipment a = new AudioVisualEquipment(
                Integer.parseInt(event_id_text_field.getText()), 
                event_date.getValue(),
                equipment_info_text_area.getText()
        );
        
        a.addAudioVisualEquipment();
        
        event_id_text_field.setText(null);
        event_date.setValue(null);
        equipment_info_text_area.setText(null);
    }

    @FXML
    private void OnClickBackButton(ActionEvent event) throws IOException {
        FXMLLoader loader2 = new FXMLLoader();
        loader2.setLocation(getClass().getResource("FXML_EC_home_scene.fxml"));
        Parent homeScene2 = loader2.load();
        Scene homepage2 = new Scene(homeScene2);
        Stage window2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        window2.setScene(homepage2);
        window2.show();
    }
}
