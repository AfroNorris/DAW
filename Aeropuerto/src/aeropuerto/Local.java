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
public class Local extends Vuelo {

    public Local(int codVuelo, String origen, String destino, String aerolinea, String fecha, double precio) {
        super(codVuelo, origen, destino, aerolinea, fecha, precio);
    }

    @Override
    public double calculaVuelo() {
        double precio = getPrecio();
        String[] partes = getFecha().split("/");
        if (partes[1].equalsIgnoreCase("07")) {
            return precio * 1.25;
        } else if (partes[1].equals("08")) {

            return precio * 1.30;
        }

        return precio;
    }

   
}
