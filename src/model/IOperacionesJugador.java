/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public interface IOperacionesJugador {
    public boolean create(Jugador j);
    public ArrayList<Jugador> read();
    public boolean update(Jugador j);
    public boolean delete(Jugador id);
    public Jugador buscarJugador(String id);
}


