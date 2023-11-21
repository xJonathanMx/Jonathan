/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registrojugadores;

import bd.Conexion;
import java.sql.Connection;

/**
 *
 * @author admin
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion db = new Conexion();
        Connection con = db.conectar();

        if (con != null) {
            System.out.println("Tamos ready!!!!");
        } else {
            System.out.println("Anda a jugar padel!!!");
        }
    }
}




