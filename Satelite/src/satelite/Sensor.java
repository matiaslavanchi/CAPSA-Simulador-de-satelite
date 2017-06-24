/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package satelite;
import java.sql.SQLException;
 import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author matt
 */
public class Sensor {

   

private String nombre; private String ubicacion; private int valor;
public Sensor() { nombre = ""; ubicacion = ""; valor = 0; }
public Sensor (String nombre, String ubicacion) { this.nombre = nombre; this.ubicacion = ubicacion;  }
public int getValor() { 
    Random rnd = new Random();
    valor =  rnd.nextInt(50);
    ConectDB BD = new ConectDB();
    try {
        BD.Insert(nombre,valor);
    } catch (SQLException ex) {
        Logger.getLogger(Sensor.class.getName()).log(Level.SEVERE, null, ex);
    }
    return valor;  }


    
}

