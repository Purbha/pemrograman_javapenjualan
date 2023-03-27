/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemrogramanjavapenjualan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Irsyad
 */
public class Latihan3 extends javax.swing.JFrame {

    private final String DB_Username = "root";
    private final String DB_Password = "";
    private final String DB_Koneksi = "jdbc:mysql://localhost/dbjual";

    public Latihan3() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextField_Kode = new javax.swing.JTextField();
        jButton_Cari = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Kode Barang");

        jTextField_Kode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_KodeKeyPressed(evt);
            }
        });

        jButton_Cari.setText("Cari");
        jButton_Cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CariActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Forte", 1, 16)); // NOI18N
        jLabel1.setText("Pencarian Data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(19, 19, 19)
                        .addComponent(jTextField_Kode, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Cari)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_Kode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Cari))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(386, 236));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_KodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_KodeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_KodeKeyPressed

    private void jButton_CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CariActionPerformed
        // TODO add your handling code here:
        try {
            String Kode_Barang = jTextField_Kode.getText();
            String SQL = "SELECT * FROM barang WHERE kdbrg = '" + Kode_Barang + "'" ;
            String Pesan1 = "Data ditemukan.";
            String Pesan2 = "Data tidak ditemukan.";
            Connection Conn; Statement Stmt; ResultSet RS;
            Conn = (Connection) DriverManager.getConnection(DB_Koneksi, 
                    DB_Username, DB_Password);
            Stmt = Conn.createStatement();
            RS = Stmt.executeQuery(SQL);
            if(RS.next()){
                JOptionPane.showMessageDialog(rootPane, Pesan1, 
                        "Informasi", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(rootPane, Pesan2, 
                        "Informasi", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {     
            
        }
    }//GEN-LAST:event_jButton_CariActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Cari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField_Kode;
    // End of variables declaration//GEN-END:variables
}
