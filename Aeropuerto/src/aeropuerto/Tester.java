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
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    GestorAeropuerto g = new GestorAeropuerto(); 
    g.creaVuelos();
    Vuelo a = new Internacional(3223, "francua", "Madrid", "Iberia", "02/05/2000",100,0);
    
    Vuelo c = new Internacional(3223, "francua", "Madrid", "Iberia", "02/03/2000",100.00,1);
   
       
        System.out.println("INTER");
        System.out.println(a.calculaVuelo());
        System.out.println(a.getAerolinea());
        System.out.println(a.getCodVuelo());
        System.out.println(a.getFecha());
       
        System.out.println(c.calculaVuelo());
        System.out.println(a.calculaVuelo());
        Vuelo b = new Local(12, "francua", "Madrid", "Iberia", "02/07/2000",100);
        System.out.println( b.calculaVuelo());

        System.out.println(g.getVuelos()[2].getPrecio());
        g.ordenaVuelosPorPrecio();
        System.out.println(g);
}
}
