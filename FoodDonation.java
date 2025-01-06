package weddingplanner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FoodDonation implements Serializable {
    private int event_id;
    private String comment;

    public FoodDonation(int event_id, String comment) {
        this.event_id = event_id;
        this.comment = comment;
    }
    
            
    public void addFoodDonation(){
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("FoodDonation.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
            oos.writeObject(this);

        } catch (IOException ex) {
            Logger.getLogger(FoodDonation.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(FoodDonation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static ArrayList<FoodDonation> listOfFoodDonation(){
        ArrayList<FoodDonation>uList = new ArrayList<>();
        
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        try {
            f = new File("FoodDonation.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            FoodDonation u;
            try{
                while(true){
                    u = (FoodDonation)ois.readObject();
                    uList.add(u);
                }
            }//end of nested try
            catch(Exception e){
                //
            }//nested catch                 
        } catch (IOException ex) { } 
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }    
        return uList;
    }      
    
    
}
