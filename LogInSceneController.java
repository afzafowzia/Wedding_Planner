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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Menu;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author HP
 */
public class LogInSceneController implements Initializable {

    @FXML    private ComboBox<String> LogInAsComboBox;
    @FXML    private TextField userIdTextField;
    @FXML    private TextField passwordTextField;
    @FXML
    private Menu fileMenuBar;
    @FXML
    private BorderPane borderpane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        LogInAsComboBox.getItems().addAll(
            "Manager",
            "Accountant",
            "Venue Manager",
            "Vendor Management",
            "Catering Manager",
            "Entertaintment Coordinator",
            "Event Coordinator",
            "Decoration Management"
        );
    }    


    @FXML
    private void LogInButtnOnClick(ActionEvent event) throws IOException {
        
    String role;
        role = LogInAsComboBox.getValue();
               if (role.equals("Event Coordinator")&& userIdTextField.getText().equals("2010078")&& passwordTextField.getText().equals("abc")) {
                    Parent Parent = FXMLLoader.load(getClass().getResource("EventCoordinatorScene.fxml"));
                    Scene EventCoordinatorScene = new Scene(Parent);
                    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    window.setScene(EventCoordinatorScene);
                    window.show();
                    

                }
               /*
                 else  {
                        Alert a = new Alert(Alert.AlertType.ERROR);
                        a.setContentText("Oops! Something went wrong. \nTry later...");
                        a.showAndWait();
                }
               */
                if (role.equals("Decoration Management")&& userIdTextField.getText().equals("2010078")&& passwordTextField.getText().equals("abc")) {
                    Parent Parent = FXMLLoader.load(getClass().getResource("DecorationManagementScene.fxml"));
                    Scene DecorationManagementScene = new Scene(Parent);
                    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    window.setScene(DecorationManagementScene);
                    window.show();
                } 
                if (role.equals("Venue Manager")&& userIdTextField.getText().equals("1910892")&& passwordTextField.getText().equals("123")) {
                    Parent dashboardParent = FXMLLoader.load(getClass().getResource("VenueManager.fxml"));
                    Scene dashboardScene = new Scene(dashboardParent);
                    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    window.setScene(dashboardScene);
                     window.show();
                }
                if (role.equals("Vendor Management")&& userIdTextField.getText().equals("1910892")&& passwordTextField.getText().equals("123")) {
                    Parent dashboardParent = FXMLLoader.load(getClass().getResource("VendorManagement.fxml"));
                    Scene dashboardScene = new Scene(dashboardParent);
                    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    window.setScene(dashboardScene);
                     window.show();
                }
                if (role.equals("Manager") && userIdTextField.getText().equals("1821818")&& passwordTextField.getText().equals("123")) {
                    Parent dashboardParent = FXMLLoader.load(getClass().getResource("MainManagersDashboard.fxml"));
                    Scene dashboardScene = new Scene(dashboardParent);
                    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    window.setScene(dashboardScene);
                     window.show();
                }
                if (role.equals("Accountant") && userIdTextField.getText().equals("1821818")&& passwordTextField.getText().equals("123")) {
                    Parent dashboardParent = FXMLLoader.load(getClass().getResource("AccountantDashboard.fxml"));
                    Scene dashboardScene = new Scene(dashboardParent);
                    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    window.setScene(dashboardScene);
                     window.show();
                }
                if (role.equals("Catering Manager")) {
                    Parent dashboardParent = FXMLLoader.load(getClass().getResource("FXML_CM_home_scene.fxml"));
                    Scene dashboardScene = new Scene(dashboardParent);
                    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    window.setScene(dashboardScene);
                     window.show();
                }
                if (role.equals("Entertaintment Coordinator")) {
                    Parent dashboardParent = FXMLLoader.load(getClass().getResource("FXML_EC_home_scene.fxml"));
                    Scene dashboardScene = new Scene(dashboardParent);
                    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    window.setScene(dashboardScene);
                     window.show();
                }
    }

    @FXML
    private void registrationButtonOnClick(ActionEvent event) {
        Parent Parent = null;
        try {
            Parent = FXMLLoader.load(getClass().getResource("RegistrationScene.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(LogInSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
                    Scene DecorationManagementScene = new Scene(Parent);
                    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    window.setScene(DecorationManagementScene);
                        window.show();
    }

    @FXML
    private void developmentByButtonOnClick(ActionEvent event) throws IOException {
        
        Parent dashboardParent = FXMLLoader.load(getClass().getResource("DeveloperInfoScene.fxml"));
        Scene dashboardScene = new Scene(dashboardParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(dashboardScene);
        window.show();      
        
    }

    @FXML
    private void contactDetailsButtonOnClick(ActionEvent event) throws IOException {
        
        Parent dashboardParent = FXMLLoader.load(getClass().getResource("ContactInfoScene.fxml"));
        Scene dashboardScene = new Scene(dashboardParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(dashboardScene);
        window.show();  
        
    }

    @FXML
    private void AboutUsButtonOnClick(ActionEvent event) throws IOException {
        
        Parent dashboardParent = FXMLLoader.load(getClass().getResource("AboutUsScene.fxml"));
        Scene dashboardScene = new Scene(dashboardParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(dashboardScene);
        window.show();  
        
    }
    
}
