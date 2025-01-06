/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

/**
 *
 * @author X-WAY
 */
public class EntertainmentPlan implements Serializable{
    private String planing;
    private int event_id;

    public EntertainmentPlan(String planing, int event_id) {
        this.planing = planing;
        this.event_id = event_id;
    }
    
    public void addEntertainmentPlan() {
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("EntertainmentPlan.bin");
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
            Logger.getLogger(EntertainmentPlan.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(EntertainmentPlan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static ArrayList<EntertainmentPlan> listOfEntertainmentPlan(){
        ArrayList<EntertainmentPlan>mList = new ArrayList<>();
        
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        try {
            f = new File("EntertainmentPlan.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            EntertainmentPlan m;
            try{
                while(true){
                    m = (EntertainmentPlan)ois.readObject();
                    mList.add(m);
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
        return mList;
    }

}
