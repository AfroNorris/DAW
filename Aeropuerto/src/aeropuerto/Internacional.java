/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuerto;

import java.util.Date;

/**
 *
 * @author tiberiu
 */
public class Internacional extends Vuelo {

    private int escalas = 0;
    private double descuento[] = new double[]{1.0, 0.20, 0.40, 0.60, 0.80};

    public Internacional(int codVuelo, String origen, String destino, String aerolinea, String fecha, double precio, int escalas) {
        super(codVuelo, origen, destino, aerolinea, fecha, precio);
    }

    public int getEscalas() {
        return escalas;
    }

    public void setEscalas(int i) {
        this.escalas = i;
    }

    public double[] getDescuento() {
        return descuento;
    }

    public void setDescuento(double[] descuento) {
        this.descuento = descuento;
    }

    @Override
    public double calculaVuelo() {
        double precio = getPrecio();
   
        String[] partes = getFecha().split("/");
        if (partes[1].equalsIgnoreCase("07") || partes[1].equals("08")) {
            return precio *1.25 - (precio*descuento[escalas]);
        }

        return precio - (precio*descuento[escalas]);
    }

}
