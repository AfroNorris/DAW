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
abstract class Vuelo {
    private int codVuelo;
    private String origen, destino;
    private String aerolinea;
    private String fecha;
    private double precio;
  

    public Vuelo(int codVuelo, String origen, String destino, String aerolinea, String fecha,double precio) {
        this.codVuelo = codVuelo;
        this.origen = origen;
        this.destino = destino;
        this.aerolinea = aerolinea;
        this.fecha = fecha;
        this.precio=precio;
    }
//    public Vuelo() {
//        this.codVuelo = 0;
//        this.origen = "Madrid";
//        this.destino = "Paris";
//        this.aerolinea = "Iberia";
//        this.fecha = "12/12/2001";
//        this.precio=Math.random()*100;
//    }
    public abstract double calculaVuelo();

    @Override
    public String toString() {
        return "Vuelo" + "codVuelo=" + codVuelo + ", origen=" + origen + ", destino=" + destino + ", aerolinea=" + aerolinea + ", fecha=" + fecha + ", precio=" + precio+"\n" ;
    }
    

    public int getCodVuelo() {
        return codVuelo;
    }
   
    public void setCodVuelo(int codVuelo) {
        this.codVuelo = codVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
