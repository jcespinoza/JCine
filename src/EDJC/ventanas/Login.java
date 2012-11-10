/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Login.java
 *
 * Created on Nov 7, 2012, 4:00:35 PM
 */
package EDJC.ventanas;

import EDJC.seguridad.Usuario;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Edgardo Castellanos
 */
public class Login extends javax.swing.JFrame {
    crearCuenta c=new crearCuenta();
    
    

    /** Creates new form Login */
    public Login() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        jbCrear = new javax.swing.JButton();
        jbIngresar = new javax.swing.JButton();
        jbGuest = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("AcadEref", 1, 10));
        setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 24));
        jLabel1.setText("LOGIN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 10, 91, 50);

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 1, 18));
        jLabel3.setText("Usuario");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(230, 70, 80, 27);
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(190, 100, 160, 30);

        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 1, 18));
        jLabel4.setText("Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(230, 180, 80, 30);
        getContentPane().add(txtpassword);
        txtpassword.setBounds(190, 210, 160, 30);

        jbCrear.setFont(new java.awt.Font("Tahoma", 1, 11));
        jbCrear.setText("Crear Cuenta");
        jbCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCrearActionPerformed(evt);
            }
        });
        getContentPane().add(jbCrear);
        jbCrear.setBounds(370, 290, 110, 40);

        jbIngresar.setFont(new java.awt.Font("Tahoma", 1, 11));
        jbIngresar.setText("Ingresar");
        jbIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbIngresarMouseClicked(evt);
            }
        });
        getContentPane().add(jbIngresar);
        jbIngresar.setBounds(210, 290, 120, 40);

        jbGuest.setFont(new java.awt.Font("Tahoma", 1, 11));
        jbGuest.setText("Guest");
        jbGuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuestActionPerformed(evt);
            }
        });
        getContentPane().add(jbGuest);
        jbGuest.setBounds(50, 290, 120, 40);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-543)/2, (screenSize.height-399)/2, 543, 399);
    }// </editor-fold>//GEN-END:initComponents

private void jbGuestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuestActionPerformed
// TODO add your handling code here:
   this.txtUsuario.setText("Usuario"); 
   this.txtpassword.setText("Password");
   
}//GEN-LAST:event_jbGuestActionPerformed

private void jbIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbIngresarMouseClicked
// TODO add your handling code here:
    Usuario ut=new Usuario(this.txtUsuario.getText(),this.txtpassword.getPassword());
    
    if(ut.getUsername().equals("Usuario")){
           JOptionPane.showMessageDialog(this,"Bienvenido","Bien hecho",JOptionPane.INFORMATION_MESSAGE);
           setDefaultCloseOperation(Login.HIDE_ON_CLOSE);
           setVisible(false);
           return;
}   
    else if(c.usuarios.isEmpty()){
           JOptionPane.showMessageDialog(this,"Usuario No Existente","Error",JOptionPane.ERROR_MESSAGE);
           txtUsuario.setText("");
            txtpassword.setText("");
           return;
    }
    //For each necesario para obtener el getPassword de cada objeto del ArrayList
    for(Usuario u: c.usuarios){
        if(c.usuarios.contains(ut)&& Arrays.equals(u.getPassword(), ut.getPassword())){
           JOptionPane.showMessageDialog(this,"Bienvenido","Bien hecho",JOptionPane.INFORMATION_MESSAGE);
           setDefaultCloseOperation(Login.HIDE_ON_CLOSE);
           setVisible(false); 
        }
        else{
            JOptionPane.showMessageDialog(this,"Usuario no Existente","Error",JOptionPane.ERROR_MESSAGE);
        txtUsuario.setText("");
            txtpassword.setText("");
        }
    }
}//GEN-LAST:event_jbIngresarMouseClicked

private void jbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCrearActionPerformed
// TODO add your handling code here:
   
    c.setVisible(true);
   
}//GEN-LAST:event_jbCrearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbCrear;
    private javax.swing.JButton jbGuest;
    private javax.swing.JButton jbIngresar;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
