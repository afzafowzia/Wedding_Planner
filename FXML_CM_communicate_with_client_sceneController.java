
package weddingplanner;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


public class FXML_CM_communicate_with_client_sceneController implements Initializable {
    int from_id = 22;

    @FXML
    private TextArea msgBodyField;
    @FXML
    private TextField from;
    @FXML
    private TextField to;
    @FXML
    private TextField subjectField;
    @FXML
    private DatePicker date;
    @FXML
    private TableView<Message> tableView;
    @FXML
    private TableColumn<Message, Integer> id_col;
    @FXML
    private TableColumn<Message, LocalDate> date_col;
    @FXML
    private TableColumn<Message, String> sub_col;
    @FXML
    private TableColumn<Message, String> body_col;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        from.setText(Integer.toString(from_id));
        
        id_col.setCellValueFactory(new PropertyValueFactory<Message,Integer>("toID"));
        date_col.setCellValueFactory(new PropertyValueFactory<Message,LocalDate>("date"));
        sub_col.setCellValueFactory(new PropertyValueFactory<Message,String>("subject"));
        body_col.setCellValueFactory(new PropertyValueFactory<Message,String>("body"));
        
        ArrayList<Message>m = Message.listOfMessage();
        for(Message i: m){
            if(i.getToID() == from_id){
                 tableView.getItems().add(i);
            }
        }
    }    

    @FXML
    private void onClickHomeSceneButton(ActionEvent event) throws IOException {
        FXMLLoader loader2 = new FXMLLoader();
        loader2.setLocation(getClass().getResource("FXML_CM_home_scene.fxml"));
        Parent homeScene2 = loader2.load();
        Scene homepage2 = new Scene(homeScene2);
        FXML_CM_home_sceneController controller2 = loader2.getController();
        Stage window2 = (Stage)((Node)event.getSource()).getScene().getWindow();
        window2.setScene(homepage2);
        window2.show();
    }

    @FXML
    private void onClickSendButton(ActionEvent event) throws IOException {
        Message m = new Message(
                Integer.parseInt(to.getText()),
                Integer.parseInt(from.getText()),
                date.getValue(),
                msgBodyField.getText(),
                subjectField.getText()
            );
        m.addMessage();
        
        to.setText(null);
        date.setValue(null);
        msgBodyField.setText(null);
        subjectField.setText(null);
        
    }
    
}
