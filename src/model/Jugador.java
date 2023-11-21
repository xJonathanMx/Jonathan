/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author admin
 */
public class Jugador {

    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private int numeroCamiseta;
    private String pais;
    private String equipoJuega;
    private String equipoJugado;


    public Jugador() {
    }

    public Jugador(int id, String nombre, String apellido, int edad, int numeroCamiseta, String pais, String equipoJuega, String equipoJugado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numeroCamiseta = numeroCamiseta;
        this.pais = pais;
        this.equipoJuega = equipoJuega;
        this.equipoJugado = equipoJugado;
    }

    public String getEquipoJugado() {
        return equipoJugado;
    }

    public void setEquipoJugado(String equipoJugado) throws Exception {
        if (!equipoJugado.isBlank() && !equipoJugado.isEmpty()) {
            this.equipoJugado = equipoJugado;
        } else {
            throw new Exception("Debe ingresar un equipo donde jugo...");
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (!nombre.isBlank() && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {

            throw new Exception("Debe agregar un nombre...");
            }

    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) throws Exception {
        if (!apellido.isBlank() && !apellido.isEmpty()) {
            this.apellido = apellido;
        } else {
            throw new Exception("Debe ingresar un apellido...");
        }

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if (edad > 0) {
            this.edad = edad;
        } else {
            throw new Exception("Ingrese una edad valida...");
        }

    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) throws Exception {
        if (edad > 0) {
            this.numeroCamiseta = numeroCamiseta;
        } else {
            throw new Exception("Ingrese un numero de camiseta valido...");
        }

    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) throws Exception {
        if (!pais.isBlank() && !pais.isEmpty()) {
            this.pais = pais;
        } else {
            throw new Exception("Debe ingresar un Pais...");
        }

    }

    public String getEquipoJuega() {
        return equipoJuega;
    }

    public void setEquipoJuega(String equipoJuega) throws Exception {
        if (!equipoJuega.isBlank() && !equipoJuega.isEmpty()) {
            this.equipoJuega = equipoJuega;
        } else {
            throw new Exception("Debe ingresar el equipo...");
        }

    }

    public void setid(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void getnombre(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
