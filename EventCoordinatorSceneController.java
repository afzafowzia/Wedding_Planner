
package weddingplanner;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class EventCoordinatorSceneController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private void OpenAddNewVolunteerSceneButtonOnClick(ActionEvent event) throws IOException {
        
        Parent Parent = FXMLLoader.load(getClass().getResource(".fxml"));
        Scene EventCoordinatorScene = new Scene(Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(EventCoordinatorScene);
        window.show();
    }

    @FXML
    private void VolunteerSceneButtonOnClick(ActionEvent event) throws IOException {
        

        Parent Parent = FXMLLoader.load(getClass().getResource("addVolunteerScene.fxml"));
        Scene EventCoordinatorScene = new Scene(Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(EventCoordinatorScene);
        window.show();

    }

    @FXML
    private void DestinationSceneButtonOnClick(ActionEvent event) throws IOException {
        
        Parent Parent = FXMLLoader.load(getClass().getResource("DestinationScene.fxml"));
        Scene EventCoordinatorScene = new Scene(Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(EventCoordinatorScene);
        window.show();
        
    }

    @FXML
    private void PackageSceneButtonOnClick(ActionEvent event) throws IOException {
        
        Parent Parent = FXMLLoader.load(getClass().getResource("newpackage.fxml"));
        Scene EventCoordinatorScene = new Scene(Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(EventCoordinatorScene);
        window.show();

    }

    @FXML
    private void CoreographerSceneButtonOnClick(ActionEvent event) throws IOException {
        
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Information Alert");
        a.setHeaderText("Notice");
        a.setContentText("No Coreographer.");
        a.showAndWait();  

    }

    @FXML
    private void PhotograpgherSceneButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void BackLOGINSceneButtonOnClick(ActionEvent event) throws IOException {
        
        Parent Parent = FXMLLoader.load(getClass().getResource("LogInScene.fxml"));
        Scene EventCoordinatorScene = new Scene(Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(EventCoordinatorScene);
        window.show();
    }

    @FXML
    private void groupTableSceneButtonOnClick(ActionEvent event) throws IOException {
        
        Parent Parent = FXMLLoader.load(getClass().getResource("viewgroupInfoScene.fxml"));
        Scene EventCoordinatorScene = new Scene(Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(EventCoordinatorScene);
        window.show();        

    }

    @FXML
    private void EventHostSceneButtonOnClick(ActionEvent event) throws IOException {
        
        Parent Parent = FXMLLoader.load(getClass().getResource("HostInfoScene.fxml"));
        Scene EventCoordinatorScene = new Scene(Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(EventCoordinatorScene);
        window.show();         
    }

    @FXML
    private void DestinationInfoSceneButtonOnClick(ActionEvent event) throws IOException {
        
        Parent Parent = FXMLLoader.load(getClass().getResource("DestinationInformationScene.fxml"));
        Scene EventCoordinatorScene = new Scene(Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(EventCoordinatorScene);
        window.show();
    }


}
