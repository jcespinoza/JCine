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

    /**
     *
     * @param peli
     */
    @Override
    public void agregarPelicula(Pelicula peli) {
        if(peli instanceof Pelicula3D)
            this.peliculas.add(peli);
    }
}
