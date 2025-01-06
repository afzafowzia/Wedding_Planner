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

/**
 *
 * @author HP
 */
public class EventCoordinator extends User implements Serializable {
 
    
    public static boolean addnewVolunteer(int id, String name, LocalDate doj, LocalDate dob,String group, String department, float salary){
        Volunteer newVolunteer = new Volunteer(
                
                id,
                name,
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
            f = new File("Volunteer.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
           
            oos.writeObject(newVolunteer);
            oos.close();
            return true;
           
        }//try end
        catch (IOException ex) {
            if(oos!=null) try {
                oos.close();
            } catch (IOException ex1) {
                Logger.getLogger(EventCoordinator.class.getName()).log(Level.SEVERE, null, ex1);
            }
            return false;
        }  //catch end
     
    }//end of method
    public static boolean addnewHost( String name, String contact, String email, LocalDate doe){
        Host newHost = new Host(
                
                name,
                contact,
                email,
                doe
                    
        );
        
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("Host.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
           
            //oos.writeObject(newHost);
            oos.close();
            return true;
           
        }//try end
        catch (IOException ex) {
            if(oos!=null) try {
                oos.close();
            } catch (IOException ex1) {
                Logger.getLogger(EventCoordinator.class.getName()).log(Level.SEVERE, null, ex1);
            }
            return false;
        }  //catch end
     
    }//end of method                
    public static boolean addnewDestination( String destination, String contact, String name, LocalDate doEvent){
        DestintionClass newDestination = new DestintionClass(
                
                destination,
                contact,
                name,
                doEvent
                    
        );
        
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("Destination.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
           
            oos.writeObject(newDestination);
            oos.close();
            return true;
           
        }//try end
        catch (IOException ex) {
            if(oos!=null) try {
                oos.close();
            } catch (IOException ex1) {
                Logger.getLogger(EventCoordinator.class.getName()).log(Level.SEVERE, null, ex1);
            }
            return false;
        }  //catch end
     
    }//end of method   
    public static ObservableList <PieChart.Data> viewDestinationRatioChart(){
        
        
        ObservableList <PieChart.Data> pieDataSet
                = FXCollections.observableArrayList();
        
        int BaliIndonesiaCount = 0;
        int MauiHawaiiCount = 0;
        int ParisFranceCount = 0;
        int RivieraMayaMexicoCount= 0;
        
        
        ObjectInputStream ois = null;
        DestintionClass tempDestination = null;
        
        try{
            
            ois = new ObjectInputStream(
                            new FileInputStream(
                                    "Destination.bin"
                            
                            )
                    
                    );
            
            while(true){
                    tempDestination = (DestintionClass)ois.readObject();
                    if(tempDestination.getDestination().equals("Bali-Indonesia") )
                        
                        BaliIndonesiaCount ++;
                    else if(tempDestination.getDestination().equals("Maui-Hawaii") )
                        
                        MauiHawaiiCount ++;
                    else if(tempDestination.getDestination().equals("Paris-France"))
                        
                        ParisFranceCount ++;
                    else if(tempDestination.getDestination().equals("Riviera Maya-Mexico"))
                        
                        RivieraMayaMexicoCount ++;
                    
                }//while
            
        }//try
        catch(Exception e){
            
            if (ois != null)
                
                try{
                    ois.close();
                    
                }catch(IOException ex){
                    
                    //...
                }
            
        }//catch
        finally{
            
            pieDataSet.add(
            new PieChart.Data("Bali-Indonesia",BaliIndonesiaCount)
            );
            
            pieDataSet.add(
            new PieChart.Data("Maui-Hawaii",MauiHawaiiCount)
            );
            pieDataSet.add(
            new PieChart.Data("Paris-France",ParisFranceCount)
            );
            pieDataSet.add(
            new PieChart.Data("Riviera Maya-Mexico",RivieraMayaMexicoCount)
            );
           
            
            return pieDataSet;
        }//finally
        
        
        
    }//end of method    
}// end of class
