/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EDJC.salas.sillas;

import java.awt.event.MouseEvent;

/**
 *
 * @author Jay C Espinoza
 */
public class Silla4Design extends SillaV{
    private boolean visible;

    public Silla4Design(int num, char fila){
        super(num, fila);
        setColorS(SeatState.DISPONIBLE.toColor());
    }
    boolean getVisibility(){
        return visible;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        visible = !visible;
        this.setVisible(visible);
        /*
         * Will play a sound and hide itself. If it's already hidden it will show up and play a diferent sound
         */
        if(visible)
            System.out.println("Now I'm hidden");
        else
            System.out.println("Now I'm visible");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(visible)
            System.out.println(this.getFullName());
    }

    @Override
    public void setVisible(boolean flag){
        super.setOpaque(flag);
        setContentAreaFilled(flag);
        if(flag)
            this.setText("" + numero);
        else
            this.setText("  ");
    }
}
