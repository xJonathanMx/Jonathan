/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
//import com.mysql.jdbc.Connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.IOperacionesJugador;
import model.Jugador;

/**
 *
 * @author admin
 */
public class JugadorDAO implements IOperacionesJugador {

    Conexion db = new Conexion();
    PreparedStatement pst;
    ResultSet rs;

    @Override
    public boolean create(Jugador j) {
        try {
            Connection con = db.conectar();
            String query = "INSERT INTO `jugador` (`id`, `nombre`, `apellido`, `edad`, `numeroCamiseta`, `pais`, `equipoJuega`, `equipoJugado`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, j.getId());
            pst.setString(2, j.getNombre());
            pst.setString(3, j.getApellido());
            pst.setInt(4, j.getEdad());
            pst.setInt(5, j.getNumeroCamiseta());
            pst.setString(6, j.getPais());
            pst.setString(7, j.getEquipoJuega());
            pst.setString(8, j.getEquipoJugado());
                    
            if (pst.executeUpdate() > 0) {
                return true;

            }con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(JugadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public ArrayList<Jugador> read() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        try {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            Connection con = db.conectar();
            String query = "SELECT * FROM `jugador`";
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            ArrayList<Jugador> lista = new ArrayList();

            while (rs.next()) {
                Jugador j = new Jugador();
                j.setId(rs.getInt("id"));
                j.setNombre(rs.getString("nombre"));
                j.setApellido(rs.getString("apellido"));
                j.setEdad(rs.getInt("edad"));
                j.setNumeroCamiseta(rs.getInt("numeroCamiseta"));
                j.setPais(rs.getString("pais"));
                j.setEquipoJuega(rs.getString("equipoJuega"));
                j.setEquipoJugado(rs.getString("equipoJugado"));

                lista.add(j);

            }
            con.close();
            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(JugadorDAO.class.getName()).log(Level.SEVERE, null, ex);
            //throw new (ex.getMessage())
        } catch (Exception ex) {
            Logger.getLogger(JugadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    @Override
    public boolean update(Jugador j) {
        try {
            Connection con = db.conectar();
            String query = "UPDATE `jugador` SET `NOMBRE` = ?, `APELLIDO` = ?, `EDAD` = ? ,`numeroCamiseta`= ?,`pais`= ?, `equipoJuega`= ?,`equipoJugado` =? WHERE `jugador`.`id` = ?;";
            pst = con.prepareStatement(query);
            pst.setInt(8, j.getId());
            pst.setString(1, j.getNombre());
            pst.setString(2, j.getApellido());
            pst.setInt(3, j.getEdad());
            pst.setInt(4, j.getNumeroCamiseta());
            pst.setString(5, j.getPais());
            pst.setString(6, j.getEquipoJuega());
            pst.setString(7, j.getEquipoJugado());
            if (pst.executeUpdate() >= 1) {
                return true;
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(JugadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean delete(Jugador id) {
        try {
            Connection con = db.conectar();
            String query = "DELETE FROM jugador WHERE id = "+id.getId();
            System.out.println(query);
            pst = con.prepareStatement(query);
            Jugador j = new Jugador();
            if (pst.executeUpdate() >  0) {
                 return true;
            }else{
                throw new Exception("Jugador no encontrado");
            }

        } catch (SQLException ex) {
            Logger.getLogger(JugadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(JugadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

    @Override
    public Jugador buscarJugador(String id) {
        try {
            Connection con = db.conectar();
            String query = "SELECT * FROM `jugador` WHERE id=" + id;
            pst = con.prepareStatement(query);
            rs = pst.executeQuery();
            Jugador j = new Jugador();
            while (rs.next()) {
                j.setId(rs.getInt("id"));
                j.setNombre(rs.getString("nombre"));
                j.setApellido(rs.getString("apellido"));
                j.setEdad(rs.getInt("edad"));
                j.setNumeroCamiseta(rs.getInt("numeroCamiseta"));
                j.setPais(rs.getString("Pais"));
                j.setEquipoJuega(rs.getString("EquipoJuega"));
                j.setEquipoJugado(rs.getString("EquipoJugado"));
            }
            return j;
        } catch (SQLException ex) {
            Logger.getLogger(JugadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(JugadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
