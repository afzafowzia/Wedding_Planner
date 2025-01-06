package weddingplanner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;
import javax.annotation.Resource;

/**
 *
 * @author HP
 */
public class MainManager extends User implements Serializable {
 
    
                
    public static boolean addnewProduct( String quantity, String productName){
        ResourceAllocation newProduct = new ResourceAllocation
        (
                quantity,
                productName
        );
        
        
        
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("Product.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream2(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
           
            oos.writeObject(newProduct);
            oos.close();
            return true;
           
        }//try end
        catch (IOException ex) {
            if(oos!=null) try {
                oos.close();
            } catch (IOException ex1) {
                Logger.getLogger(ResourceAllocation.class.getName()).log(Level.SEVERE, null, ex1);
            }
            return false;
        }  //catch end
     
    }//end of method   
    
        
      
}// end of class
