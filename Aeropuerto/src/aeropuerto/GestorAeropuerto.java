/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aeropuerto;

import java.util.Arrays;

/**
 *
 * @author tiberiu
 */
public class GestorAeropuerto {
    private Vuelo vuelos []= new Vuelo[100];
   

public GestorAeropuerto(){
    
}    
public void creaVuelos(){
    for (int i = 0; i < 100; i++) {
        if (i%2==0) {
           
            vuelos[i] = new Internacional(00000+i, "Madrid", "Milan", "Iberia", "02/04/2019",(Math.random()*500)+200 ,0);
        }
        else {
             vuelos[i]=new Local(0000+i, "Marbella", "Madrid", "Iberia", "01/08/20019",(Math.random()*300)+200);
        }
    }
}
        
    public Vuelo[] getVuelos() {
        return vuelos;
    }
    public void ordenaVuelosPorPrecio(){
        Vuelo aux ;
        boolean fin=false;
        for (int i = 0; i <vuelos.length-1 ; i++) {
            for (int j = 0; j < vuelos.length-1; j++) {
                 if (vuelos[j]!=null&&vuelos[j+1]!=null && vuelos[i].getPrecio()<vuelos[j].getPrecio()) {
                  aux = vuelos[i];
                  vuelos[i]=vuelos[j];
                  vuelos[j]=aux;
                  fin =false;    
            }
           
            }
            fin=true;
        }
    }
    public void eliminaVuelo(int codVuelo){
        boolean fin =false;
        for (int i = 0; i <vuelos.length&&fin==false; i++) {
            if (vuelos[i].getCodVuelo()== codVuelo) {
                vuelos[i]=null;
                fin=true;  
            }
            
        }
        if (fin==false) {
            System.out.println("Vuelo No encontrado!");
        }
        else {
            System.out.println("Vuelo Borrado!");
        }
    }

    public void setVuelos(Vuelo[] vuelos) {
        this.vuelos = vuelos;
    }

    public GestorAeropuerto(Vuelo[] vuelos) {
        this.vuelos = vuelos;
    }

    @Override
    public String toString() {
        return Arrays.toString(vuelos);
    }
    
    
}
