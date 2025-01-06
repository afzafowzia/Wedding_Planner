package weddingplanner;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author rafia
 */
public class ManagerDashboardController implements Initializable {

    @FXML
    private ComboBox<String> selectToRemoveVenueCombobox;
    @FXML
    private Label updateVenueNameLabel;
    @FXML
    private ComboBox<String> seeVenueDetailsCombobox;
    @FXML
    private TextField newVenueNameTextArea;
    @FXML
    private TextField VenueLocationTextArea;
    @FXML
    private TextArea outputTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    //ArrayList<String> venuelist = new ArrayList<>();
    @FXML
    private void addVenueButtonOnClick(ActionEvent event) {
        Boolean giveStatus =
                Venue.addvenue(
                newVenueNameTextArea.getText(),
                 VenueLocationTextArea.getText()
                );
        if(giveStatus)
            {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("New Venue Is Added.");
            a.showAndWait();
        }
        else
        {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setContentText("Oops! Something went wrong. \nTry later...");
            a.showAndWait();
        }  
    }

    @FXML
    private void removeVenueButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void seeVenueDetailsSelectionCombobox(ActionEvent event) {
    }

    @FXML
    private void showVenueListbuttonOnclick(ActionEvent event) throws FileNotFoundException, IOException, ClassNotFoundException {
        outputTextArea.setText("\n");
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        try {
            f = new File("Venue.bin");
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
            outputTextArea.appendText("\n This IS The New Venue\n");            
        } catch (IOException ex) { } 
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }           
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) {
        try {
        Parent parent = FXMLLoader.load(getClass().getResource("VenueManager.fxml"));
        Scene newScene = new Scene(parent);
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(newScene);
    }   catch (IOException ex) {
        Logger.getLogger(VenueManagerController.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    @FXML
    private void viewNewRegisteredPeopleButtonOnClick(ActionEvent event) {
         try {
            Parent dashboardParent = FXMLLoader.load(getClass().getResource("ViewNewRegisteredPeople.fxml"));
            Scene dashboardScene = new Scene(dashboardParent);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(dashboardScene);
            window.show();
        } catch (IOException ex) {
            Logger.getLogger(ManagerDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
    

