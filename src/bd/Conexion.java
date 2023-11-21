/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class Conexion {

    Connection conectar = null;
    String servidor = "127.0.0.1";
    String baseDatos = "futboldb";
    String usuario = "root";
    String password = "";

    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //conectar=DriverManager.getConnection("jdbc:mysql:"
            //          + "//localhost/productos", "root","");
            conectar = DriverManager.getConnection("jdbc:mysql:"
                    + "//" + servidor + "/" + baseDatos, usuario, password);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return conectar;
    }
}
