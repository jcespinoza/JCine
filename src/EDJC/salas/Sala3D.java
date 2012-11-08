/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EDJC.salas;

import EDJC.peliculas.Pelicula;

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
        this.peliculas.add(peli);
    }
}
