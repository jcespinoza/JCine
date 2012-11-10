/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EDJC.salas;

import EDJC.peliculas.Pelicula;
import EDJC.peliculas.Pelicula3D;

/**
 *
 * @author Jay C Espinoza
 */
public class Sala3D extends SalaCine{
    Tipo3DFormato tipo3D;
    
    public Sala3D(Tipo3DFormato tipo){
        super();
        tipo3D = tipo;
        setInitialPrice();
    }
    
    /**
     *
     * @param peli
     */
    @Override
    public void agregarPelicula(Pelicula peli) {
        this.peliculas.add(peli);
    }

    private void setInitialPrice() {
        if(tipo3D == Tipo3DFormato.DIGITAL)
                precioTicket = 90.0;
        precioTicket = 110.0;
    }
    
}