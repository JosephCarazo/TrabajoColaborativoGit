/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabajocolaborativogit;

/**
 *
 * @author josep
 */
public class FrmHuevo extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmHuevo() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnHuevo = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnHuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnHuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/huevo100.png"))); // NOI18N
        btnHuevo.setText("PULSA PARA QUE NAZCA");
        btnHuevo.setContentAreaFilled(false);
        btnHuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHuevo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/huevo100.png"))); // NOI18N
        btnHuevo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/huevo178.png"))); // NOI18N
        btnHuevo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnHuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnHuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, 370));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoPrincipal.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuevoActionPerformed
//        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoSecundario2.jpg"))); // NOI18N
//        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }//GEN-LAST:event_btnHuevoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmHuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmHuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmHuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmHuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmHuevo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuevo;
    private javax.swing.JLabel lblFondo;
    // End of variables declaration//GEN-END:variables
}
