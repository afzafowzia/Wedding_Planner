
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


public class FXML_CM_caterer_coordination_sceneController implements Initializable {

    @FXML
    private TextField event_id_text_field;
    @FXML
    private TextField vendor_id_text_field;
    @FXML
    private TextField payment_text_field;
    @FXML
    private TextArea view_vendor_text_area;
    @FXML
    private TextArea text_area_agreement;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        String mus_info = "Vendor ID: 1\nName: abcd\nEmail: aaaaa@gmai.com\nContact: 01234234234\n";
        mus_info += "Vendor ID: 2\nName: bbb\nEmail: aaaaa@gmai.com\nContact: 01234234234\n";
        mus_info += "Vendor ID: 3\nName: ccc\nEmail: aaaaa@gmai.com\nContact: 01234234234\n";
        
        view_vendor_text_area.setText(mus_info);
    }    

    @FXML
    private void onClickHireButton(ActionEvent event) {
        int event_id = Integer.parseInt(event_id_text_field.getText());
        int musician_id = Integer.parseInt(vendor_id_text_field.getText());
        String contact_agreement = text_area_agreement.getText();
        int payment_amount = Integer.parseInt(payment_text_field.getText());
        
        VendorAgreement m = new VendorAgreement(event_id,musician_id,payment_amount, contact_agreement);
        m.addVendorAgreement();
        
        event_id_text_field.setText(null);
        vendor_id_text_field.setText(null);
        text_area_agreement.setText(null);
        payment_text_field.setText(null);        
    }

    @FXML
    private void clickOnBackButton(ActionEvent event) throws IOException {
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
