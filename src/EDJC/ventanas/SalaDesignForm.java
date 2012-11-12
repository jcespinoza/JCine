/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EDJC.ventanas;

import EDJC.salas.sillas.Silla4Design;
import EDJC.salas.sillas.Sillero4Design;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jay C Espinoza
 */
public class SalaDesignForm extends JDialog implements ActionListener{
    private Sillero4Design sala;
    
    public SalaDesignForm(JFrame owner, int filas, int cols){
        super(owner, "Diseño de la Sala", true);
        sala = new Sillero4Design(filas, cols);
        initComponents();
    }

    private void initComponents() {
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        //BoxLayout bx = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS);
        
        //Titulo de la ventana
        JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.add(new JLabel("<html><h1><b>Diseño de la Sala</b></h1></html>", JLabel.CENTER));
        panel1.add(new JLabel("<html><i>Muestre u oculte asientos segun la realidad y " + 
                "presione el boton de Guardar o cierre la ventana</i></html>", JLabel.CENTER));
        
        //Agrega la cuadricula de sillas
        JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        panel2.add(sala);
        
        //Boton de aceptar
        JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton save = new JButton("Guardar y Salir");
        panel3.add(save);
        
        //Agrega los paneles al contenedor principal
        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.CENTER);
        this.add(panel3, BorderLayout.SOUTH);
        goFullScreen();

        save.addActionListener(this);
    }
    
    private void goFullScreen() {
        Rectangle maxBounds = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
        this.setSize(maxBounds.width, maxBounds.height);
    }
    
    public static void main(String[] args) {
        SalaDesignForm sd = new SalaDesignForm(null, 10, 20);
        sd.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.setVisible(false);
        this.dispose();
    }

    Sillero4Design getSalaDesign() {
        return this.sala;
    }
}