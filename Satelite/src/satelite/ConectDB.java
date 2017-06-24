/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package satelite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author matt
 */
public class ConectDB {
    public boolean Insert(String nombre,int valor) throws SQLException{
    String url = "jdbc:mysql://" + "localhost:3306" + "/" + "Personas"+"?useSSL=false"; 
    Connection conect = DriverManager.getConnection(url, "root", "todobien");
    try (PreparedStatement stmt = conect.prepareStatement("insert into Valores (nombre,valor) values ('"+nombre+"','"+valor+"')")) {
    stmt.executeUpdate();
    conect.close();
    return true; 
} catch (SQLException ex) { 
  JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);

}return false; 
    

}
}