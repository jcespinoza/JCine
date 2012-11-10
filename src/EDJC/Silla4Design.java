/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EDJC;

import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Jay C Espinoza
 */
public class Silla4Design extends SillaV{
    SeatState state;

    public Silla4Design(int num, char fila){
        super(num, fila);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        /*Will change seat color based on the available states
         * if the state is RESERVADO it shouldn't do anything*
         */
        JOptionPane.showMessageDialog(getParent(), "I'm changing colors!!");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        /*Will play a sound when the mouse hover the component
         * 
         */
        JOptionPane.showMessageDialog(getParent(), "I'm playing sounds!");
    }
}
