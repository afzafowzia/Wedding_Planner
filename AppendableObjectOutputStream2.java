/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weddingplanner;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
/**
 *
 * @author Start
 */

    
   

/**
 *
 * @author X-WAY
 */
public class AppendableObjectOutputStream2 extends ObjectOutputStream {

    public AppendableObjectOutputStream2(OutputStream out) throws IOException {
        super(out);
    }
    
    @Override
    protected void writeStreamHeader() throws IOException {
    
    }
}











    

