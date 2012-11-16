/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EDJC.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Jay C Espinoza
 */
public class CustomJFrame{
    private JFrame frame;
    private JLayeredPane jlp;
    
    public CustomJFrame(){
        frame = new JFrame("Prueba");
        jlp = new JLayeredPane();
        initComponents();
    }
    
    public void setVisible(boolean flag){
        frame.setVisible(flag);
    }

    private void initComponents() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(480, 320);
        
        JLabel jl = new JLabel("I'm a Label");
        String imagePath = "resources/img/logo.jpg";
        File imageFile = new File(imagePath);
        System.out.println(imageFile.getAbsolutePath());
        ImageIcon image = new ImageIcon(imageFile.getAbsolutePath());
        if(imageFile.exists()) {
            jl.setIcon(image);
        }
        frame.setContentPane(new BackgroundPanel(image.getImage()));
        JPanel jp = new JPanel();
        jp.setLayout(new FlowLayout());
        JButton jb = new JButton("Im a fucking button bitches!");
        jb.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Succes Motherfuckers!!");
            }
        });
        jp.add(jb);
        jp.setOpaque(false);
        frame.add(jp);
    }
    
    public static void main(String[] args) {
        CustomJFrame cf = new CustomJFrame();
        cf.setVisible(true);
    }
}