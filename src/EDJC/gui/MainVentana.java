/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainVentana.java
 *
 * Created on Nov 9, 2012, 9:10:47 AM
 */
package EDJC.gui;

import EDJC.Cine;
import EDJC.seguridad.Usuario;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Edgardo Castellanos
 */
public class MainVentana extends javax.swing.JFrame {
    Cine cine = new Cine("CineMark");
    Login log;

    /** Creates new form MainVentana */
    public MainVentana() {
        cine.getUsuarios().add(new Usuario("usuario", "password".toCharArray()));
        cine.getUsuarios().add(new Usuario("jc", "123456".toCharArray()));
        cine.getUsuarios().add(new Usuario("ed", "123456".toCharArray()));
        cine.getUsuarios().add(new Usuario("nadie", "123456".toCharArray()));
        initComponents();
        createFiles();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jbIngresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbAdministrador = new javax.swing.JCheckBox();
        cdCliente = new javax.swing.JCheckBox();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel1.setText("Bienvenido a Cinemark");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 10, 260, 40);

        jbIngresar.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jbIngresar.setText("Ingresar");
        jbIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(jbIngresar);
        jbIngresar.setBounds(100, 270, 150, 40);

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel3.setText("Tipo");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 60, 80, 40);

        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel4.setText("Administrador");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 120, 100, 30);

        jLabel5.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jLabel5.setText("Cliente");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 180, 60, 30);

        cbAdministrador.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cbAdministradorStateChanged(evt);
            }
        });
        getContentPane().add(cbAdministrador);
        cbAdministrador.setBounds(210, 120, 21, 21);

        cdCliente.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cdClienteStateChanged(evt);
            }
        });
        getContentPane().add(cdCliente);
        cdCliente.setBounds(210, 180, 21, 21);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-363)/2, (screenSize.height-378)/2, 363, 378);
    }// </editor-fold>//GEN-END:initComponents

private void jbIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIngresarActionPerformed
// TODO add your handling code here:
  if(this.cbAdministrador.isSelected()==false&& this.cdCliente.isSelected()==false){
         JOptionPane.showMessageDialog(this, "Obligatorio escoger una opcion","Error",JOptionPane.ERROR_MESSAGE);
        return;
    }
   else if(this.cbAdministrador.isSelected()==true&& this.cdCliente.isSelected()==true){
       JOptionPane.showMessageDialog(this, "Obligatorio escoger una opcion","Error",JOptionPane.ERROR_MESSAGE);
       return;
   }
    if(this.cbAdministrador.isSelected()==true){
        log = new Login(cine);
        log.setVisible(true);
        return;
    }
    else if(this.cdCliente.isSelected()==true){
        JOptionPane.showMessageDialog(this, "blabla","Error",JOptionPane.ERROR_MESSAGE);
        return;
    }
}//GEN-LAST:event_jbIngresarActionPerformed

private void cbAdministradorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cbAdministradorStateChanged
// TODO add your handling code here:
    if(this.cbAdministrador.isSelected())
        this.cdCliente.setSelected(false);
}//GEN-LAST:event_cbAdministradorStateChanged

private void cdClienteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cdClienteStateChanged
// TODO add your handling code here:
    if(this.cdCliente.isSelected())
        this.cbAdministrador.setSelected(false);
}//GEN-LAST:event_cdClienteStateChanged

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
            java.util.logging.Logger.getLogger(MainVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainVentana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainVentana().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbAdministrador;
    private javax.swing.JCheckBox cdCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbIngresar;
    // End of variables declaration//GEN-END:variables

    private void createFiles() {
        File cine = new File("cine");
        if(!cine.exists())
            cine.mkdir();
        RandomAccessFile dataFile = null;
        try {        
            dataFile = new RandomAccessFile("GeneralData.mov", "r");
            if( dataFile.length() == 0)
                dataFile.writeInt(0);
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }catch( IOException ex){
            
        }finally{
            if( dataFile != null)
                dataFile.close();
        }

    }
}
