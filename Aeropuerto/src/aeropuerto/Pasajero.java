/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuerto;

/**
 *
 * @author tiberiu
 */
public class Pasajero {
    private int dni;
    private String nombre;

    public Pasajero(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    public Pasajero(){
        StringBuilder sb = new StringBuilder("Pasajero ");
        sb.append((int) (Math.random() * 10000));
        this.nombre=sb.toString();
        this.dni=(int)(Math.random() * 20000000);
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
