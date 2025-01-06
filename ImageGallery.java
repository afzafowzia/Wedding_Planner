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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafia
 */
public class ImageGallery implements Serializable{
    private String photographerName;
    private int salarey;

    public ImageGallery() {
    }

    public ImageGallery(String photographerName, int salarey) {
        this.photographerName = photographerName;
        this.salarey = salarey;
    }

    public String getPhotographerName() {
        return photographerName;
    }

    public void setPhotographerName(String photographerName) {
        this.photographerName = photographerName;
    }

    public int getSalarey() {
        return salarey;
    }

    public void setSalarey(int salarey) {
        this.salarey = salarey;
    }

    @Override
    public String toString() {
        return "ImageGallery{" + "photographerName=" + photographerName + ", salarey=" + salarey + '}';
    }
    
    public void imageGallery() {
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("photographer.bin");
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
            Logger.getLogger(ImageGallery.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(ImageGallery.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static ArrayList<ImageGallery> photographerList(){
        ArrayList<ImageGallery>iList = new ArrayList<>();
        
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        try {
            f = new File("photographer.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            ImageGallery i;
            try{
                while(true){
                    i = (ImageGallery)ois.readObject();
                    iList.add(i);
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
        return iList;
}
}