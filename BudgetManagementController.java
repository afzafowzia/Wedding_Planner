/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package weddingplanner;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.time.LocalDate;
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author rafia
 */
public class BudgetManagementController implements Initializable {

    @FXML
    private DatePicker budgetDateCombobox;
    @FXML
    private TextField budgetNameTextfield;
    @FXML
    private TextField amountTextfield;
    @FXML
    private TextArea outputTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addNewBudgetButtonOnClick(ActionEvent event) {
        
        String name= budgetNameTextfield.getText();
        int amount= Integer.parseInt(amountTextfield.getText());
        LocalDate date=budgetDateCombobox.getValue();
        Budget b= new Budget(name,amount,date);
        b.Budget();
        budgetNameTextfield.setText(null);
        amountTextfield.setText(null);
        
    }

    @FXML
    private void showBudgetButtonOnClick(ActionEvent event) {
        outputTextArea.setText("\n");
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        try {
            f = new File("Budget.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Budget bu;
            try{
                outputTextArea.setText("\n");
                while(true){
                    System.out.println("Printing objects.");
                    bu = (Budget)ois.readObject();
                  
                    
                    System.out.println(bu.toString());
                    outputTextArea.appendText(bu.toString());
                }
            }
            catch(Exception e){
                //
            }//nested catch     
            outputTextArea.appendText("\nThis IS The New Budget\n");            
        } catch (IOException ex) { } 
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }           
    }

    @FXML
    private void previousButtonOnClick(ActionEvent event) {
        try {
        Parent parent = FXMLLoader.load(getClass().getResource("VenueManager.fxml"));
        Scene newScene = new Scene(parent);
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(newScene);
    }   catch (IOException ex) {
        Logger.getLogger(VenueManagerController.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
}