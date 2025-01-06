/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Start
 */
public class MainManagersDashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void strategyButtonOnClick(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("Strategy.fxml"));
            Scene newScene = new Scene(parent);
            Stage newStage = new Stage();
            newStage.setScene(newScene);
            newStage.show();
        } 
        catch (IOException ex) {
            Logger.getLogger(MainManagersDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void clientRelationshipManagementButtonOnClick(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("Client.fxml"));
            Scene newScene = new Scene(parent);
            Stage newStage = new Stage();
            newStage.setScene(newScene);
            newStage.show();
        } 
        catch (IOException ex) {
            Logger.getLogger(MainManagersDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void resourceAllocationButtonOnClick(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("ResourceAllocation.fxml"));
            Scene newScene = new Scene(parent);
            Stage newStage = new Stage();
            newStage.setScene(newScene);
            newStage.show();
        } 
        catch (IOException ex) {
            Logger.getLogger(MainManagersDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void vendorsAndStakeholdersButtonOnClick(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("Vendors&Stakeholders.fxml"));
            Scene newScene = new Scene(parent);
            Stage newStage = new Stage();
            newStage.setScene(newScene);
            newStage.show();
        } 
        catch (IOException ex) {
            Logger.getLogger(MainManagersDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void budgetAndFinanceButtonOnClick(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("Budget&Finance.fxml"));
            Scene newScene = new Scene(parent);
            Stage newStage = new Stage();
            newStage.setScene(newScene);
            newStage.show();
        } 
        catch (IOException ex) {
            Logger.getLogger(MainManagersDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void qualityAssuranceButtonOnClick(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("QualityAssurance.fxml"));
            Scene newScene = new Scene(parent);
            Stage newStage = new Stage();
            newStage.setScene(newScene);
            newStage.show();
        } 
        catch (IOException ex) {
            Logger.getLogger(MainManagersDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void riskManagementButtonOnClick(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("RiskManagement.fxml"));
            Scene newScene = new Scene(parent);
            Stage newStage = new Stage();
            newStage.setScene(newScene);
            newStage.show();
        } 
        catch (IOException ex) {
            Logger.getLogger(MainManagersDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void teamManagementButtonOnClick(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("TeamManagement.fxml"));
            Scene newScene = new Scene(parent);
            Stage newStage = new Stage();
            newStage.setScene(newScene);
            newStage.show();
        } 
        catch (IOException ex) {
            Logger.getLogger(MainManagersDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    private void logOutButtonOnClick(ActionEvent event) {
        try {
        Parent parent = FXMLLoader.load(getClass().getResource("LogInScene.fxml"));
        Scene newScene = new Scene(parent);
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(newScene);
    }   catch (IOException ex) {
        Logger.getLogger(LogInSceneController.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
}
