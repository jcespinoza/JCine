/*
 * Frame used to test VisualCompoments not designed by Edgardo
 * So if he touches this file may the gods throw curses at him
 */
package EDJC;

import EDJC.salas.sillas.Silla4Design;
import EDJC.salas.sillas.SillaV;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jay C Espinoza
 */
public class TestFrame extends JDialog implements ActionListener{
    private SillaV jc;
    
    public TestFrame(){
        super();
        setSize(new Dimension(400, 320));
        jc = new Silla4Design(5, 'B');
        this.getContentPane().setLayout(new FlowLayout());
        getContentPane().add(jc);
    }
    
    public static void main(String[] args) {
        TestFrame tf = new TestFrame();
        tf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof SillaV)
            JOptionPane.showMessageDialog(this, "Ye");
    }
}
