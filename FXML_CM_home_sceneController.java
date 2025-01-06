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


public class FXML_CM_home_sceneController implements Initializable {
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onClickMenuPlanning(ActionEvent event) throws IOException {
        FXMLLoader loader2 = new FXMLLoader();
        loader2.setLocation(getClass().getResource("FXML_CM_menu_paning_scene.fxml"));
        Parent homeScene2 = loader2.load();
        Scene homepage2 = new Scene(homeScene2);
        Stage window2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        window2.setScene(homepage2);
        window2.show();
    }

    @FXML
    private void onClickCatererCoordination(ActionEvent event) throws IOException {
        FXMLLoader loader2 = new FXMLLoader();
        loader2.setLocation(getClass().getResource("FXML_CM_caterer_coordination_scene.fxml"));
        Parent homeScene2 = loader2.load();
        Scene homepage2 = new Scene(homeScene2);
        Stage window2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        window2.setScene(homepage2);
        window2.show();
    }

    @FXML
    private void onClickCommunicatewithClient(ActionEvent event) throws IOException {
        FXMLLoader loader2 = new FXMLLoader();
        loader2.setLocation(getClass().getResource("FXML_CM_communicate_with_client_scene.fxml"));
        Parent homeScene2 = loader2.load();
        Scene homepage2 = new Scene(homeScene2);
        Stage window2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        window2.setScene(homepage2);
        window2.show();
    }

    @FXML
    private void onClickFoodTastingandQualityControl(ActionEvent event) throws IOException {
        FXMLLoader loader2 = new FXMLLoader();
        loader2.setLocation(getClass().getResource("FXML_CM_food_tasting_quality_control_scene.fxml"));
        Parent homeScene2 = loader2.load();
        Scene homepage2 = new Scene(homeScene2);
        Stage window2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        window2.setScene(homepage2);
        window2.show();
    }

    @FXML
    private void onClickCateringBudgeting(ActionEvent event) throws IOException {
        FXMLLoader loader2 = new FXMLLoader();
        loader2.setLocation(getClass().getResource("FXML_CM_Catering_Budgeting_scene.fxml"));
        Parent homeScene2 = loader2.load();
        Scene homepage2 = new Scene(homeScene2);
        Stage window2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        window2.setScene(homepage2);
        window2.show();
    }

    @FXML
    private void onCLickLogoutButton(ActionEvent event) throws IOException {
        FXMLLoader loader2 = new FXMLLoader();
        loader2.setLocation(getClass().getResource("FXML_Users_scene.fxml"));
        Parent homeScene2 = loader2.load();
        Scene homepage2 = new Scene(homeScene2);
        Stage window2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        window2.setScene(homepage2);
        window2.show();
    }


    @FXML
    private void onClickCommunicatewithothereventcoordinators(ActionEvent event) throws IOException {
        FXMLLoader loader2 = new FXMLLoader();
        loader2.setLocation(getClass().getResource("FXML_CM_communicate_with_client_scene.fxml"));
        Parent homeScene2 = loader2.load();
        Scene homepage2 = new Scene(homeScene2);
        Stage window2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        window2.setScene(homepage2);
        window2.show();
    }

    @FXML
    private void onClickHandlingLeftoverFood(ActionEvent event) throws IOException {
        FXMLLoader loader2 = new FXMLLoader();
        loader2.setLocation(getClass().getResource("FXML_CM_handlingLeftoverFood_scene.fxml"));
        Parent homeScene2 = loader2.load();
        Scene homepage2 = new Scene(homeScene2);
        Stage window2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        window2.setScene(homepage2);
        window2.show();
    }
    
}
