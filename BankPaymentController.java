package weddingplanner;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.Random;
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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author rafia
 */
public class BankPaymentController implements Initializable {

    @FXML
    private ComboBox<String> selectionVendorCombobox;
    @FXML
    private TextField vendorIdTextField;
    @FXML
    private TextField vendorBankAccountNoTextField;
    @FXML
    private TextField routingNoTextField;
    @FXML
    private ComboBox<String> selectBankCombobox;
    @FXML
    private Button makePaymentButtonOnClick;
    @FXML
    private TextField paymentAmountButtonOnClick;
    @FXML
    private DatePicker datePicker;
    private int invoiceCounter = 1;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        
        selectionVendorCombobox.getItems().addAll("Food",
                                                  "Photographer",
                                                  "Music pros");
        
        selectBankCombobox.getItems().addAll("IBBL",
                                             "BRACK",
                                             "UCB",
                                             "AB BAnk");
    }    

    @FXML
    private void makePaymentButtonOnClick(ActionEvent event) {
        
        int invoiceNumber = generateInvoiceNumber();
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("BankPayment.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            BankPayment b= new BankPayment(
                    selectBankCombobox.getValue(),
                    Integer.parseInt(vendorBankAccountNoTextField.getText()),
                    Integer.parseInt(routingNoTextField.getText()),
                    Integer.parseInt(vendorIdTextField.getText()),
                    Integer.parseInt(paymentAmountButtonOnClick.getText()),
                    selectionVendorCombobox.getValue(),
                    datePicker.getValue(),
                    invoiceNumber
                    
            );
            
            oos.writeObject(b);
            
            clearInputFields();
            
        }  catch (IOException ex) {
            Logger.getLogger(BankPaymentController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(BankPaymentController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    
    }               
        private void clearInputFields() {  
        vendorBankAccountNoTextField.clear();
        routingNoTextField.clear();
        vendorIdTextField.clear();
        paymentAmountButtonOnClick.clear();
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
    return invoiceNumber;
    
}
}