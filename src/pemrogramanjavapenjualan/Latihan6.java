
package pemrogramanjavapenjualan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Irsyad
 */
public class Latihan6 extends javax.swing.JFrame {

    private final String DB_Username = "root";
    private final String DB_Password = "";
    private final String DB_Koneksi = "jdbc:mysql://localhost/dbjual";
    
    public Latihan6() {
        initComponents();
        Atur_Combo();
        Bersih();
    }
    
    private void Atur_Combo(){
        jComboBox_Kategori.removeAllItems();
        jComboBox_Kategori.addItem("HARD DISK");
        jComboBox_Kategori.addItem("USB FLASH DISK");
        jComboBox_Kategori.addItem("MEMORY");
        jComboBox_Kategori.addItem("SPEAKER");
        jComboBox_Kategori.addItem("CASING");
    }
    
    private void Bersih(){
        jTextField_Kdbar.setText("");
        jTextField_Nmbar.setText("");
        jTextField_Stok.setText("0");
        jTextField_Harga.setText("0");
        buttonGroup_Garansi.clearSelection();
        jComboBox_Kategori.setSelectedIndex(0);
    }
    
    private boolean Cek_Kode(){
        boolean Cek = true;
        String Kode_Barang = jTextField_Kdbar.getText().trim();
        if(Kode_Barang.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Kode Barang tidak boleh kosong.",
                    "Informasi", JOptionPane.INFORMATION_MESSAGE);
            jTextField_Kdbar.requestFocus();
            Cek = false;
        }
        return Cek;
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_Garansi = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Kdbar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_Nmbar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_Harga = new javax.swing.JTextField();
        jTextField_Stok = new javax.swing.JTextField();
        jComboBox_Kategori = new javax.swing.JComboBox();
        jRadioButton_Ya = new javax.swing.JRadioButton();
        jRadioButton_Tidak = new javax.swing.JRadioButton();
        jButton_Update = new javax.swing.JButton();
        jButton_Cari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Update Data");

        jLabel2.setText("Kode Barang");

        jLabel3.setText("Nama Barang");

        jLabel4.setText("Harga");

        jLabel5.setText("Stok");

        jLabel6.setText("Kategori");

        jLabel7.setText("Garansi");

        jComboBox_Kategori.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "USB FLASH DISK", "SPEAKER", "HARD DISK" }));

        buttonGroup_Garansi.add(jRadioButton_Ya);
        jRadioButton_Ya.setText("Ya");

        buttonGroup_Garansi.add(jRadioButton_Tidak);
        jRadioButton_Tidak.setText("Tidak");

        jButton_Update.setText("Update");
        jButton_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateActionPerformed(evt);
            }
        });

        jButton_Cari.setText("Cari");
        jButton_Cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton_Ya)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton_Tidak))
                                    .addComponent(jComboBox_Kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Nmbar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Harga, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Stok, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton_Update))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_Kdbar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Cari)))
                        .addContainerGap(83, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_Kdbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Cari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_Nmbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_Harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_Stok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox_Kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jRadioButton_Ya)
                    .addComponent(jRadioButton_Tidak))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Update)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(422, 380));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CariActionPerformed
        // TODO add your handling code here:
        if(Cek_Kode() == false){ return; }       
        try {
            String Kode_Barang = jTextField_Kdbar.getText().trim();
            String SQL = "SELECT * FROM barang WHERE kdbrg = '" + Kode_Barang + "'";
            Connection Conn = (Connection) DriverManager.getConnection(DB_Koneksi, 
                    DB_Username, DB_Password);
            Statement Stmt = Conn.createStatement();
            ResultSet RS = Stmt.executeQuery(SQL);;
            if(!RS.next()){
                 JOptionPane.showMessageDialog(rootPane, "Kode Barang tidak ditemukan.",
                         "Informasi", JOptionPane.INFORMATION_MESSAGE);
                 jTextField_Kdbar.setText("");
                 jTextField_Kdbar.requestFocus();
                 return;                
            }
            
            JOptionPane.showMessageDialog(rootPane, "Kode Barang ditemukan.",
                    "Informasi", JOptionPane.INFORMATION_MESSAGE);
            jTextField_Nmbar.setText(RS.getString("brg_nama"));
            jTextField_Harga.setText(RS.getString("brg_harga"));
            jTextField_Stok.setText(RS.getString("brg_stok"));
            jComboBox_Kategori.setSelectedItem(RS.getString("brg_kategori"));
            if(RS.getString("brg_garansi").equals("1")){
                jRadioButton_Ya.setSelected(true);             
            } else {
                jRadioButton_Tidak.setSelected(true);
            }
            Stmt.close();
            Conn.close();            
         } catch (SQLException e) {
             e.printStackTrace();
         }    
    }//GEN-LAST:event_jButton_CariActionPerformed

    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed
        // TODO add your handling code here:
        if(Cek_Kode() == false){ return; }       
        try {
            String Kode_Barang = jTextField_Kdbar.getText().trim();
            String Nama_Barang = jTextField_Nmbar.getText().trim();
            String Harga = jTextField_Harga.getText().trim();
            String Stok = jTextField_Stok.getText().trim();
            String Kategori = jComboBox_Kategori.getSelectedItem().toString();
            String Garansi = "0";
            if(jRadioButton_Ya.isSelected()) { Garansi = "1"; }
            Calendar Cal = Calendar.getInstance();
            SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String TanggalJam = SDF.format(Cal.getTime());                
            
            //=========================SQL Update=========================================//
            String SQL = "UPDATE barang SET ";
            SQL += "brg_nama = '" + Nama_Barang  + "', ";   //1
            SQL += "brg_harga = '" + Harga  + "', ";        //2
            SQL += "brg_stok = '" + Stok  + "', ";
            SQL += "brg_kategori = '" + Kategori  + "', ";
            SQL += "brg_garansi = '" + Garansi  + "', ";
            SQL += "brg_update = '" + TanggalJam  + "' ";
            SQL += "WHERE kdbrg = '" + Kode_Barang + "'";
            //============================================================================//
            
            Connection Conn = (Connection) DriverManager.getConnection(DB_Koneksi, 
                    DB_Username, DB_Password);
            Statement Stmt = Conn.createStatement();
            Stmt.executeUpdate(SQL);
            Stmt.close();
            Conn.close();            
            JOptionPane.showMessageDialog(rootPane, "Data berhasil diupdate.",
                    "Informasi", JOptionPane.INFORMATION_MESSAGE);
            Bersih();
            jTextField_Kdbar.requestFocus();
         } catch (SQLException e) {
             e.printStackTrace();
         }    
    }//GEN-LAST:event_jButton_UpdateActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_Garansi;
    private javax.swing.JButton jButton_Cari;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JComboBox jComboBox_Kategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton_Tidak;
    private javax.swing.JRadioButton jRadioButton_Ya;
    private javax.swing.JTextField jTextField_Harga;
    private javax.swing.JTextField jTextField_Kdbar;
    private javax.swing.JTextField jTextField_Nmbar;
    private javax.swing.JTextField jTextField_Stok;
    // End of variables declaration//GEN-END:variables
}
