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
public interface SalaI {
    void agregarPelicula(Pelicula peli);
    void setPrecio(double precio);
    Tablero getSillero();
    double getPrecioTicket();
}
