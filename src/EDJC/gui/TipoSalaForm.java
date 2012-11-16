package EDJC.gui;


import EDJC.gui.AgregarSalaPrototipo;
import EDJC.salas.Sala2D;
import EDJC.salas.Sala3D;
import EDJC.salas.SalaCine;
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TipoSalaForm.java
 *
 * Created on Nov 12, 2012, 3:06:24 PM
 */;

/**
 *
 * @author Edgardo Castellanos
 */
public class TipoSalaForm extends javax.swing.JDialog {
    String tipoSala = "2D";
    ArrayList<SalaCine> salas;
    AgregarSalaPrototipo sala;

    /** Creates new form TipoSalaForm */
    public TipoSalaForm() {
        initComponents();
    }

    TipoSalaForm(ArrayList<SalaCine> salas) {
        this.salas = salas;
        initComponents();
    }

    private void initComponents(){

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cb2 = new javax.swing.JCheckBox();
        cb1 = new javax.swing.JCheckBox();
        cb1.setSelected(true);
        jbAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 1, 18));
        jLabel1.setText("Sala 3D");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 150, 110, 40);

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 18));
        jLabel2.setText("Tipo de Sala");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 10, 110, 40);

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 1, 18));
        jLabel3.setText("Sala 2D");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 70, 110, 40);

        cb2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cb2StateChanged(evt);
            }
        });
        getContentPane().add(cb2);
        cb2.setBounds(210, 160, 21, 21);

        cb1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cb1StateChanged(evt);
            }
        });
        getContentPane().add(cb1);
        cb1.setBounds(210, 80, 21, 21);

        jbAgregar.setFont(new java.awt.Font("Traditional Arabic", 1, 18));
        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(jbAgregar);
        jbAgregar.setBounds(120, 230, 110, 40);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-377)/2, (screenSize.height-346)/2, 377, 346);
    }

private void cb1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cb1StateChanged
// TODO add your handling code here:
    if(this.cb1.isSelected()){
        this.cb2.setSelected(false);
        tipoSala = "2D";
    }
}//GEN-LAST:event_cb1StateChanged

private void cb2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cb2StateChanged
// TODO add your handling code here:
    if(this.cb2.isSelected()){
        this.cb1.setSelected(false);
        tipoSala = "3D";
    }
}//GEN-LAST:event_cb2StateChanged

private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
    SalaCine salaCreada;
    if(tipoSala.equals("2D")){
        salaCreada = new Sala2D();
    }else{
        salaCreada = new Sala3D();
    }
    salas.add(salaCreada);
    sala = new AgregarSalaPrototipo(salaCreada);
    sala.setVisible(true);
    this.setVisible(false);
}//GEN-LAST:event_jbAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(TipoSalaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TipoSalaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TipoSalaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TipoSalaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TipoSalaForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbAgregar;
    // End of variables declaration//GEN-END:variables
}
