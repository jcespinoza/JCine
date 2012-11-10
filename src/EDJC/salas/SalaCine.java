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
public abstract class SalaCine implements SalaI{
    protected SalaLayout layout;
    protected Tablero sillas;
    protected ArrayList<Pelicula> peliculas;
    protected double precioTicket;
    
    @Override
    public abstract void agregarPelicula(Pelicula peli);
    
    @Override
    public Tablero getSillero(){
        return sillas;
    }
    
    @Override
    public double getPrecioTicket(){
        return this.precioTicket;
    }

    public void setPrecioTicket(double precio){
        this.precioTicket = precio;
    }
}