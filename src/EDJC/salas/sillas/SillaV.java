/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EDJC.salas.sillas;

import EDJC.util.Coordenada;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

/**
 *
 * @author Jay C Espinoza
 */
public abstract class SillaV extends JButton implements SillaI, MouseListener{
    private int numero;
    private Coordenada coordenada;
    private char fila;
    private String fullName;
    
    public SillaV(int num, char fila){
        super("" + num);
        setNumber(num);
        setRowLetter(fila);
        addMouseListener(this);
    }

    @Override
    public final Color getColorS() {
        return this.getBackground();
    }

    @Override
    public final int getNumber() {
        return this.numero;
    }

    @Override
    public final Coordenada getCoordinate() {
        return this.coordenada;
    }

    @Override
    public final void setHeightS(int h) {
        if(h > 0)
            setSize(getWidth(), h);
    }

    @Override
    public final void setSize(int width, int height) {
        super.setSize(width, height);
        this.repaint();
    }
    


    @Override
    public final void setWidthS(int w) {
        if(w > 0)
            setSize(w, getHeight());
    }

    @Override
    public final void setColorS(Color c) {
        setBackground(c);
    }

    @Override
    public final void setNumber(int num) {
        if(num > 0)
            this.numero = num;
    }

    @Override
    public final String getFullName() {
        return "" + fila + numero;
    }

    @Override
    public final int getHeightS() {
        return getHeight();
    }

    @Override
    public final int getWidthS() {
        return getWidth();
    }

    @Override
    public final void setSizeS(Dimension d) {
        if(d.width > 0 && d.height > 0 && d.height == d.width)
            setSize(d);
    }

    @Override
    public final void setCoordinate(Coordenada c) {
        if(c.getX() > 0 && c.getY() > 0)
            this.coordenada = c;
    }

    @Override
    public final char getRowLetter() {
        return fila;
    }

    @Override
    public final void setRowLetter(char let) {
        if(let >= 65 && let <= 90)
            this.fila = let;
    }
    @Override
    public void mousePressed(MouseEvent e) {
        //Not Needed
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //No needed
    }
    
    @Override
    public void mouseExited(MouseEvent e) {
        //Not needed
    }
}