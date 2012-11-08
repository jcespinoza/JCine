/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EDJC;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Jay C Espinoza
 */
public class TestFrame extends JDialog implements ActionListener{
    private JCuadrito jc;
    
    public TestFrame(){
        super();
        setSize(new Dimension(400, 320));
        jc = new JCuadrito();
        add(jc);
    }
    
    public static void main(String[] args) {
        TestFrame tf = new TestFrame();
        tf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JCuadrito)
            JOptionPane.showMessageDialog(this, "Ye");
    }
}
