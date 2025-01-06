/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package weddingplanner;

import java.net.URL;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import static java.util.Collections.list;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Start
 */
public class BudgetController implements Initializable {

    @FXML
    private PieChart pieChart;
    @FXML
    private Label statusLabel;
    @FXML
    private Button loadPieChartButton;
    @FXML
    private Button loadPieChartButton1;
    @FXML
    private TextField newItemValue;
    @FXML
    private TextField newItemName;
    
     private ObservableList <PieChart.Data> list 
            = FXCollections.observableArrayList();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadPieChartButtonOnClick(ActionEvent event) {
        list.add( new PieChart.Data("Decoration",50000) );
        list.add( new PieChart.Data("Photographer",20000) );
        list.add( new PieChart.Data("Catering",30000) );
        list.add( new PieChart.Data("VenueManagement",60000) );
        list.add( new PieChart.Data("GenaratorBill",5000) );
        //ObservableList <PieChart.Data> list2 = FXCollections.observableArrayList();
        //list2.add(new PieChart.Data("Java",50));
        //...
        pieChart.setData(list);
        
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
            
        }
    } 

    @FXML
    private void addNewItemToChartButtonOnClick(ActionEvent event) {
         list.add(
            new PieChart.Data(
                newItemName.getText(),
                Integer.parseInt(newItemValue.getText())
            )        
        );
    }
    
}
