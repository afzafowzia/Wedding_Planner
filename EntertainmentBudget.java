
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


public class EntertainmentBudget implements Serializable {
    private int event_id;
    private LocalDate date;
    private String list_of_expences;

    public EntertainmentBudget(int event_id, LocalDate date, String list_of_expences) {
        this.event_id = event_id;
        this.date = date;
        this.list_of_expences = list_of_expences;
    }
    
            
    public void addEntertainmentBudget(){
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("EntertainmentBudget.bin");
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
            Logger.getLogger(EntertainmentBudget.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(EntertainmentBudget.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static ArrayList<EntertainmentBudget> listOfEntertainmentBudget(){
        ArrayList<EntertainmentBudget>uList = new ArrayList<>();
        
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        try {
            f = new File("EntertainmentBudget.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            EntertainmentBudget u;
            try{
                while(true){
                    u = (EntertainmentBudget)ois.readObject();
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
