package weddingplanner;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafia
 */
public class Client implements Serializable{

    public static boolean addclient(String clientname,String location){
        Client2 newClient2= new Client2(
             clientname,
             location   
        );
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("Client.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
           
            oos.writeObject(newClient2);
            oos.close();
            return true;
        }//try end
        catch (IOException ex) {
            if(oos!=null) try {
                oos.close();
            } catch (IOException ex1) {
                Logger.getLogger(Client2.class.getName()).log(Level.SEVERE, null, ex1);
            }
            return false;
        }  
     
    }
    
}

   

    
    
    
    
    

