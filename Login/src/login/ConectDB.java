/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author matt
 */
public class ConectDB {
    public Connection conectar() throws SQLException{
        String url = "jdbc:mysql://" + "localhost:3306" + "/" + "Personas";
        Connection conect = DriverManager.getConnection(url, "invitado", "invitado");
        return conect;
    }
   
    


    public int [] Consult () throws SQLException{
        int [] array = new int[4];
        try (PreparedStatement stmt = conectar().prepareStatement("select valor from Valores order by idValores desc")) {
        ResultSet rs = stmt.executeQuery();
        for (int i = 0; i < 4 ; i ++){
            rs.next();
            array[i] = rs.getInt("Valor");
            
        }
        rs.close();
        return array; 
        } catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);
    } 
        
        return array;
    }
}