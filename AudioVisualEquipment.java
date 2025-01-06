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
import weddingplanner.AppendableObjectOutputStream;

public class AudioVisualEquipment implements Serializable{
    private int event_id;
    private LocalDate event_date;
    private String equipments_info;

    public AudioVisualEquipment(int event_id, LocalDate event_date, String equipments_info) {
        this.event_id = event_id;
        this.event_date = event_date;
        this.equipments_info = equipments_info;
    }
    
        
    public void addAudioVisualEquipment(){
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("AudioVisualEquipment.bin");
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
            Logger.getLogger(AudioVisualEquipment.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(AudioVisualEquipment.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static ArrayList<AudioVisualEquipment> listOfAudioVisualEquipment(){
        ArrayList<AudioVisualEquipment>uList = new ArrayList<>();
        
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        try {
            f = new File("AudioVisualEquipment.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            AudioVisualEquipment u;
            try{
                while(true){
                    u = (AudioVisualEquipment)ois.readObject();
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
