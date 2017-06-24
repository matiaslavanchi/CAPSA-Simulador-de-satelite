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

public class MetodosLogin {
    public int validar_ingreso(String usuario, String clave) throws SQLException{
    int resultado = 0;
    //String usuario = LoginGUI.Usuario.getText();
    //String clave = String.valueOf(LoginGUI.Password.getPassword());
    String SSQL = "SELECT * FROM Usuarios WHERE Usuario='"+usuario+"' AND Clave=('"+clave+"')";
    String url = "jdbc:mysql://" + "localhost:3306" + "/" + "Personas"+"?useSSL=false"; 
    Connection conect = DriverManager.getConnection(url, "invitado", "invitado");
    try (PreparedStatement stmt = conect.prepareStatement(SSQL)) {
        ResultSet rs = stmt.executeQuery();
        while (rs.next())
            resultado = 1;
 
    } catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null, ex, "Error de conexión", JOptionPane.ERROR_MESSAGE);

    }finally{
        conect.close();
    }
    return resultado;
    }
    
    
}
