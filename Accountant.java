/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weddingplanner;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Start
 */
public class Accountant extends User implements Serializable {
     public static boolean addnewAccount(int accountId, String accountName, LocalDate doj, LocalDate dob,String group, String department, float salary){
        Employe newEmploye = new Employe(
                
                accountId,
                accountName,
                doj,
                dob,
                group,
                department,
                salary
                    
        );
        
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("Employe.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
           
            oos.writeObject(newEmploye);
            oos.close();
            return true;
           
        }//try end
        catch (IOException ex) {
            if(oos!=null) try {
                oos.close();
            } catch (IOException ex1) {
                Logger.getLogger(Accountant.class.getName()).log(Level.SEVERE, null, ex1);
            }
            return false;
        }  //catch end
     
    }//end of method
    
}
