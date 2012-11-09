/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EDJC;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Jay C Espinoza
 */
public class JCuadrito extends JPanel implements ActionListener{
    private JButton botonsito;
    
    public JCuadrito(){
        super();
        botonsito = new JButton("Aqui estoy");
        add(botonsito);
        this.setBackground(Color.red);
        botonsito.setVisible(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(true)
            botonsito.setVisible(false);
        else
            botonsito.setVisible(true);
    }
}