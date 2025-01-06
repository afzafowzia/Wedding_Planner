package weddingplanner;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author rafia
 */
public class BkashPaymentController implements Initializable {

    @FXML
    private TextField VendorIdTextField;
    @FXML
    private TextField BkashNoTextField;
    @FXML
    private ComboBox<String> selectionVendorComboBox;
    @FXML
    private TextField paymentAmountTextfield;
    @FXML
    private DatePicker datepicker;
    private int invoiceCounter = 1;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        selectionVendorComboBox.getItems().addAll("Food",
                                                  "Photographer",
                                                  "Music pros");
    }    

    @FXML
    private void makePaymentButtonOnClick(ActionEvent event) {
        int invoiceNumber = generateInvoiceNumber();
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("BkashPayment.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            BkashPayment b= new BkashPayment(
                  Integer.parseInt(BkashNoTextField.getText()),
                  Integer.parseInt(VendorIdTextField.getText()),
                  Integer.parseInt(paymentAmountTextfield.getText()),
                  selectionVendorComboBox.getValue(),
                  datepicker.getValue(),
                  invoiceNumber
            );
            
            oos.writeObject(b);
            
            clearInputFields();
        }  catch (IOException ex) {
            Logger.getLogger(BkashPaymentController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(BkashPaymentController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    
    }   private void clearInputFields() {
            BkashNoTextField.clear();
            VendorIdTextField.clear();
            paymentAmountTextfield.clear();
    
        }
    

    @FXML
    private void PreviousButtonOnClick(ActionEvent event) {
        try {
        Parent parent = FXMLLoader.load(getClass().getResource("PaymentAndInvoicing.fxml"));
        Scene newScene = new Scene(parent);
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.setScene(newScene);
    }   catch (IOException ex) {
        Logger.getLogger(PaymentAndInvoicingController.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    private int generateInvoiceNumber() {
    int invoiceNumber = invoiceCounter; 
    invoiceCounter++;
    return invoiceNumber;}
    
}
