/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package satelite;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author matt
 */
public class Satelite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inicia ini = new Inicia();
         try {
        while (true) {
            ini.getRead();;
            Thread.sleep(5 * 1000);
        }
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
                 
                
                
        
       
    }
    
}
