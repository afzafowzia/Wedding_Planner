/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package weddingplanner;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author HP
 */
public class FlowerSceneController implements Initializable {

    @FXML
    private ComboBox<String> flowernameComboBox;
    @FXML
    private TextField flowerQuantityTextField;
    
    private ObservableList <PieChart.Data> list 
          = FXCollections.observableArrayList();
    @FXML
    private PieChart pieChart;
    @FXML
    private Label statusLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        flowernameComboBox.getItems().addAll(
                "Rose",
                "Tulip",
                "Jasmine",
                "Lavender",
                "Yellow Marigold",
                "White Frangipani",
                "White Frangipani"
                
        ); 
    }    

    @FXML
    
   
    private void loadPieChartButtonOnClick(ActionEvent event) {
 /*       pieChart.setData(list);
        for(PieChart.Data data: pieChart.getData()){
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, 
                    new EventHandler<MouseEvent>(){
                @Override
                public void handle(MouseEvent event) {
                    statusLabel.setText(String.valueOf(data.getPieValue()));
                    //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            }
            );
            
        }*/
    }        
 
    

    @FXML
    private void backToDMSceneButtonOnClick(ActionEvent event) throws IOException {
                    Parent Parent = FXMLLoader.load(getClass().getResource("DecorationManagementScene.fxml"));
                    Scene EventCoordinatorScene = new Scene(Parent);
                    Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    window.setScene(EventCoordinatorScene);
                    window.show();        
        
    }

    @FXML
    private void addToPieChartButtonOnClick(ActionEvent event) {
       
            
                
    }
    
}


