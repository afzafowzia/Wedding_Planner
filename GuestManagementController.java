package weddingplanner;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author rafia
 */
public class GuestManagementController implements Initializable {

    @FXML
    private TextField guestNameTextField;
    @FXML
    private ComboBox<?> venueCombobox;
    @FXML
    private Label menuItemOutputLabel;
    @FXML
    private TextField enterMenuItemNameTextField;
    @FXML
    private RadioButton VegeterianRadiobutton;
    @FXML
    private RadioButton nonVegeterianRadioButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void menuItemListButtonOnClick(ActionEvent event) {
    }


    @FXML
    private void addNewGuestButtonOnClick(ActionEvent event) {
    }
    
}
