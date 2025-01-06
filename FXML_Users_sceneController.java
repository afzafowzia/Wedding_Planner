
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
import javafx.stage.Stage;

public class FXML_Users_sceneController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onClickEntertainmentCoordinatorButton(ActionEvent event) throws IOException {
        FXMLLoader loader2 = new FXMLLoader();
        loader2.setLocation(getClass().getResource("FXML_EC_home_scene.fxml"));
        Parent homeScene2 = loader2.load();
        Scene homepage2 = new Scene(homeScene2);
        Stage window2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        window2.setScene(homepage2);
        window2.show();
    }

    @FXML
    private void onCLickCateringManagerButton(ActionEvent event) throws IOException {
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
