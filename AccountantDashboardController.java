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
public class AccountantDashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void financemanagementButtonOnClick(ActionEvent event) {
         try {
            Parent parent = FXMLLoader.load(getClass().getResource("FinanceManagement.fxml"));
            Scene newScene = new Scene(parent);
            Stage newStage = new Stage();
            newStage.setScene(newScene);
            newStage.show();
        } 
        catch (IOException ex) {
            Logger.getLogger(AccountantDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void reportButtonOnClick(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("Report.fxml"));
            Scene newScene = new Scene(parent);
            Stage newStage = new Stage();
            newStage.setScene(newScene);
            newStage.show();
        }
        catch (IOException ex) {
            Logger.getLogger(AccountantDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void budgetButtonOnClick(ActionEvent event) {
         try {
            Parent parent = FXMLLoader.load(getClass().getResource("Budget.fxml"));
            Scene newScene = new Scene(parent);
            Stage newStage = new Stage();
            newStage.setScene(newScene);
            newStage.show();
        } 
        catch (IOException ex) {
            Logger.getLogger(AccountantDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void taxButtonOnClick(ActionEvent event) {
         try {
            Parent parent = FXMLLoader.load(getClass().getResource("Tax.fxml"));
            Scene newScene = new Scene(parent);
            Stage newStage = new Stage();
            newStage.setScene(newScene);
            newStage.show();
        } 
        catch (IOException ex) {
            Logger.getLogger(AccountantDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void payrollButtonOnClick(ActionEvent event) {
         try {
            Parent parent = FXMLLoader.load(getClass().getResource("Payroll.fxml"));
            Scene newScene = new Scene(parent);
            Stage newStage = new Stage();
            newStage.setScene(newScene);
            newStage.show();
        } 
        catch (IOException ex) {
            Logger.getLogger(AccountantDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void analysisButtonOnClick(ActionEvent event) {
         try {
            Parent parent = FXMLLoader.load(getClass().getResource("Analysis.fxml"));
            Scene newScene = new Scene(parent);
            Stage newStage = new Stage();
            newStage.setScene(newScene);
            newStage.show();
        } 
        catch (IOException ex) {
            Logger.getLogger(AccountantDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void internalSupportButtonOnClick(ActionEvent event) {
         try {
            Parent parent = FXMLLoader.load(getClass().getResource("InternalSupport.fxml"));
            Scene newScene = new Scene(parent);
            Stage newStage = new Stage();
            newStage.setScene(newScene);
            newStage.show();
        } 
        catch (IOException ex) {
            Logger.getLogger(AccountantDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void auditSupportButtonOnClick(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("AuditSupport.fxml"));
            Scene newScene = new Scene(parent);
            Stage newStage = new Stage();
            newStage.setScene(newScene);
            newStage.show();
        } 
        catch (IOException ex) {
            Logger.getLogger(AccountantDashboardController.class.getName()).log(Level.SEVERE, null, ex);
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
