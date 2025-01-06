package weddingplanner;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author rafia
 */
public class DocumentManagementController implements Initializable {

    @FXML
    private ComboBox<String> binFileSelectCombobox;
    @FXML
    private TextArea outputTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        binFileSelectCombobox.getItems().addAll("BankPayment",
                                                "BkashPayment",
                                                "Budget",
                                                "NewRegistration",
                                                "NewVendorRegistration",
                                                "Photographer",
                                                "Venue2");
    }    

    @FXML
    private void viewFileButtonOnClick(ActionEvent event) {
        String role;
        role = binFileSelectCombobox.getValue();
        if(role.equals("BankPayment")){
            outputTextArea.setText("\n");
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        try {
            f = new File("BankPayment.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            BankPayment bnk;
            try{
                outputTextArea.setText("\n");
                while(true){
                    System.out.println("Printing objects.");
                    bnk = (BankPayment)ois.readObject();
                  
                    
                    System.out.println(bnk.toString());
                    outputTextArea.appendText(bnk.toString());
                }
            }
            catch(Exception e){
                //
            }//nested catch     
            outputTextArea.appendText("\n Bank Payment Statement\n");            
        } catch (IOException ex) { } 
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }   
        }
        
        
        
        
        
        if(role.equals("BkashPayment")){
            outputTextArea.setText("\n");
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        try {
            f = new File("BkashPayment.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            BkashPayment bks;
            try{
                outputTextArea.setText("\n");
                while(true){
                    System.out.println("Printing objects.");
                    bks = (BkashPayment)ois.readObject();
                  
                    
                    System.out.println(bks.toString());
                    outputTextArea.appendText(bks.toString());
                }
            }
            catch(Exception e){
                //
            }//nested catch     
            outputTextArea.appendText("\n Bkash Payment Statement\n");            
        } catch (IOException ex) { } 
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }
        }
        
        
        
        if(role.equals("Budget")){
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
        
        
        
        if(role.equals("NewVendorRegistration")){
            outputTextArea.setText("\n");
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        try {
            f = new File("NewVendorRegistration.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            NewRegistration reg;
            try{
                outputTextArea.setText("\n");
                while(true){
                    System.out.println("Printing objects.");
                    reg = (NewRegistration)ois.readObject();
                  
                    
                    System.out.println(reg.toString());
                    outputTextArea.appendText(reg.toString());
                }
            }
            catch(Exception e){
                //
            }//nested catch     
            outputTextArea.appendText("\nThis IS The New People Who Registered\n");            
        } catch (IOException ex) { } 
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        } 
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
