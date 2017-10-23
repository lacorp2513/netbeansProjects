/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testobjectoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author cordovamendozafamily
 */
public class TestObjectOutputStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            //CREATE AN OUTPUT STREAM FOR THE FILE
            ObjectOutputStream  output = new ObjectOutputStream(new FileOutputStream("object.dat"));
            //WRITE A STRING, DOUBLE VLALUE, AND OBJECT TO THE FILE
            output.writeUTF("Luis Alberto Cordova Osorio");
            output.writeDouble(76.3);
            output.writeObject(new Date());
            
            //Close output stream
            output.close();
            
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Ther is an errorof NOTFOUND " + ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "There is an error of IO " +ex.getMessage());
        }
    }
    
}
