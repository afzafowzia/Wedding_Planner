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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class DecorationManagementSceneController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private void DesignButtonOnClick(ActionEvent event) throws IOException {
        
                    Parent Parent = FXMLLoader.load(getClass().getResource("DesignScene.fxml"));
                    Scene EventCoordinatorScene = new Scene(Parent);
                    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    window.setScene(EventCoordinatorScene);
                    window.show();
    }


    @FXML
    private void DecorationButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void FlowerButtonOnClick(ActionEvent event) throws IOException {
        
                    Parent Parent = FXMLLoader.load(getClass().getResource("FlowerScene.fxml"));
                    Scene EventCoordinatorScene = new Scene(Parent);
                    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    window.setScene(EventCoordinatorScene);
                    window.show();
    }

    @FXML
    private void BackToECSceneButtonOnClick(ActionEvent event) throws IOException {
        
        
        Parent Parent = FXMLLoader.load(getClass().getResource("LogInScene.fxml"));
        Scene EventCoordinatorScene = new Scene(Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(EventCoordinatorScene);
        window.show();
    }

    @FXML
    private void uploadPortfolioSceneButtonOnCLick(ActionEvent event) throws IOException {
        
        Parent Parent = FXMLLoader.load(getClass().getResource("UploadPortfolioScene.fxml"));
        Scene EventCoordinatorScene = new Scene(Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(EventCoordinatorScene);
        window.show();
        
    }

    @FXML
    private void ViewPortfolioSceneButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void UploadDesignButtonOnClick(ActionEvent event) throws IOException {
        Parent Parent = FXMLLoader.load(getClass().getResource("UploadDesignScene.fxml"));
        Scene EventCoordinatorScene = new Scene(Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(EventCoordinatorScene);
        window.show();
    }

    @FXML
    private void AddNewDesignerButtonOnClick(ActionEvent event) throws IOException {
        
        
        Parent Parent = FXMLLoader.load(getClass().getResource("AddNewDesignerScene.fxml"));
        Scene EventCoordinatorScene = new Scene(Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(EventCoordinatorScene);
        window.show();        
    }

    @FXML
    private void ViewDesignerButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void ViewOrderButtonOnClick(ActionEvent event) throws IOException {
        
        Parent Parent = FXMLLoader.load(getClass().getResource("ViewOrderScene.fxml"));
        Scene EventCoordinatorScene = new Scene(Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(EventCoordinatorScene);
        window.show();
    }
    
}
