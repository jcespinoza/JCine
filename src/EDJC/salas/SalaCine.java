/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EDJC.salas;

import EDJC.peliculas.Pelicula;
import java.util.ArrayList;

/**
 *
 * @author Jay C Espinoza
 */
public abstract class SalaCine {
    protected SalaLayout layout;
    protected ArrayList<Pelicula> peliculas;
    
    public abstract void agregarPelicula(Pelicula peli);
}