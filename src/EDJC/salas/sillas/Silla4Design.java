/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EDJC.salas.sillas;

import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Jay C Espinoza
 */
public class Silla4Design extends SillaV{
    private boolean visible;

    public Silla4Design(int num, char fila){
        super(num, fila);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        visible = !visible;
        /*
         * Will play a sound and hide itself. If it's already hidden it will show up and play a diferent sound
         */
        if(visible)
            JOptionPane.showMessageDialog(getParent(), "I just played a sound!!");
        else
            JOptionPane.showMessageDialog(getParent(), "I played a diferent sound!");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //not needed
    }
}
