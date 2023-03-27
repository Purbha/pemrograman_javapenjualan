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
public class Latihan2 extends javax.swing.JFrame {

    public Latihan2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Tampil = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_Tampil.setText("Tampil");
        jButton_Tampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TampilActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Jokerman LET", 1, 16)); // NOI18N
        jLabel1.setText("Menampilkan Jumlah Record");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton_Tampil))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jButton_Tampil)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(422, 356));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_TampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TampilActionPerformed
        // TODO add your handling code here:
        String DB_Username = "dbjual";
        String DB_Password = "dbjual";
        String DB_Koneksi = "jdbc:mysql://localhost/dbjual";
        String SQL = "SELECT * FROM barang";
        String Pesan;
        int Jml;
        Connection Conn;
        Statement Stmt;
        ResultSet RS;
        try {
            Conn = (Connection) DriverManager.getConnection(DB_Koneksi,
                    DB_Username, DB_Password);
            Stmt = Conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            RS = Stmt.executeQuery(SQL);
            RS.last();
            Jml = RS.getRow();
            Pesan = "Jumlah record adalah: " + Jml;
            JOptionPane.showMessageDialog(rootPane,Pesan ,
                    "Informasi",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            System.err.println(e);
        } 
    }//GEN-LAST:event_jButton_TampilActionPerformed


    
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
            java.util.logging.Logger.getLogger(Latihan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Tampil;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
