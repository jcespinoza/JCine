/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EDJC.peliculas;

/**
 *
 * @author Jay C Espinoza
 */
public class Pelicula {
    protected int duracion;
    protected String nombre;
    protected GeneroPelicula genero;
    protected TipoClasificacion clasificacion;
    protected TipoPelicula tipo;

    public Pelicula(int d, String n, GeneroPelicula g, TipoClasificacion c) {
        this.duracion = d;
        this.nombre = n;
        this.genero = g;
        this.clasificacion = c;
    }
    
    
}