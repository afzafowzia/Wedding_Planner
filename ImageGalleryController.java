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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author rafia
 */
public class ImageGalleryController implements Initializable {

    @FXML
    private TextField photographerNameTextField;
    @FXML
    private TextField salareyTextField;
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
    private void addPhotographerButton(ActionEvent event) {
        int salarey=Integer.parseInt(salareyTextField.getText());
        String name=photographerNameTextField.getText();
        
        ImageGallery i= new ImageGallery(name,salarey);
        i.imageGallery();
        
        photographerNameTextField.setText(null);
        salareyTextField.setText(null);
    }

    @FXML
    private void selectPhotographerCombobox(ActionEvent event) {
    }

    @FXML
    private void showPhotographerButtonOnClick(ActionEvent event) {
        outputTextArea.setText("\n");
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        try {
            f = new File("photographer.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            ImageGallery ig;
            try{
                outputTextArea.setText("\n");
                while(true){
                    System.out.println("Printing objects.");
                    ig = (ImageGallery)ois.readObject();
                  
                    
                    System.out.println(ig.toString());
                    outputTextArea.appendText(ig.toString());
                }
            }
            catch(Exception e){
                //
            }//nested catch     
            outputTextArea.appendText("\nThis IS The New Photographer\n");            
        } catch (IOException ex) { } 
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }           
        
    }

    @FXML
    private void selectEventCombobox(ActionEvent event) {
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
