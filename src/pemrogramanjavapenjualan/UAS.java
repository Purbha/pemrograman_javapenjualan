
package pemrogramanjavapenjualan;

//import com.mysql.jdbc.Connection;
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
public class UAS extends javax.swing.JFrame {

    /**
     * Creates new form UAS
     */
    
    private final String DB_Username = "root";
    private final String DB_Password = "";
    private final String DB_Koneksi = "jdbc:mysql://localhost/dbjual";
    
    public UAS() {
        initComponents();
        Bersih();
        jTextField_Kdpel.requestFocus();
    }

    private void Bersih(){
        jTextField_Kdpel.setText("");
        jTextArea_Alamat.setText("");
        jTextField_Nama.setText("");
        jTextField_Telp.setText("");
        buttonGroup_JK.clearSelection();
        jComboBox_Status.setSelectedIndex(0);
    }
    
    private boolean Cek_Kode(){
        boolean Cek = true;
        String KdPel = jTextField_Kdpel.getText().trim();
        if(KdPel.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Kode Pelanggan tidak boleh kosong.",
                    "Informasi", JOptionPane.INFORMATION_MESSAGE);
            jTextField_Kdpel.requestFocus();
            Cek = false;
        }
        return Cek;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_JK = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_Kdpel = new javax.swing.JTextField();
        jTextField_Nama = new javax.swing.JTextField();
        jRadioButton_Pria = new javax.swing.JRadioButton();
        jRadioButton_Wanita = new javax.swing.JRadioButton();
        jTextField_Telp = new javax.swing.JTextField();
        jComboBox_Status = new javax.swing.JComboBox();
        jButton_Add = new javax.swing.JButton();
        jButton_Save = new javax.swing.JButton();
        jButton_Update = new javax.swing.JButton();
        jButton_Delete = new javax.swing.JButton();
        jButton_Exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Alamat = new javax.swing.JTextArea();
        jButton_Cari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Data Master Pelanggan");

        jLabel2.setText("Kode");

        jLabel3.setText("Nama Pelanggan");

        jLabel4.setText("Jenis Kelamin");

        jLabel5.setText("Alamat");

        jLabel6.setText("Telp");

        jLabel7.setText("Status");

        buttonGroup_JK.add(jRadioButton_Pria);
        jRadioButton_Pria.setText("Pria");

        buttonGroup_JK.add(jRadioButton_Wanita);
        jRadioButton_Wanita.setSelected(true);
        jRadioButton_Wanita.setText("Wanita");

        jComboBox_Status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lajang", "Menikah", "Janda/Duda" }));

        jButton_Add.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton_Add.setText("Add");
        jButton_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddActionPerformed(evt);
            }
        });

        jButton_Save.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton_Save.setText("Save");
        jButton_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SaveActionPerformed(evt);
            }
        });

        jButton_Update.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton_Update.setText("Update");
        jButton_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateActionPerformed(evt);
            }
        });

        jButton_Delete.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton_Delete.setText("Delete");
        jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteActionPerformed(evt);
            }
        });

        jButton_Exit.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton_Exit.setText("Exit");
        jButton_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExitActionPerformed(evt);
            }
        });

        jTextArea_Alamat.setColumns(20);
        jTextArea_Alamat.setLineWrap(true);
        jTextArea_Alamat.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Alamat);

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
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_Add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Exit))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton_Pria)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton_Wanita))
                            .addComponent(jTextField_Telp, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField_Kdpel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton_Cari))
                                .addComponent(jTextField_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_Kdpel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Cari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jRadioButton_Pria, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jRadioButton_Wanita)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(105, 105, 105))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Telp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Add)
                    .addComponent(jButton_Save)
                    .addComponent(jButton_Update)
                    .addComponent(jButton_Delete)
                    .addComponent(jButton_Exit))
                .addGap(24, 24, 24))
        );

        setSize(new java.awt.Dimension(458, 477));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExitActionPerformed
        // TODO add your handling code here:
        int Pilihan;
        Pilihan = JOptionPane.showConfirmDialog(rootPane, "Yakin mw keluar?", 
                "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if(Pilihan == 0){ dispose(); }
    }//GEN-LAST:event_jButton_ExitActionPerformed

    private void jButton_CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CariActionPerformed
        // TODO add your handling code here:
        if(Cek_Kode() == false){ return; }       
        try {
            String KdPel = jTextField_Kdpel.getText().trim();
            String SQL = "SELECT * FROM pelanggan WHERE kdpel = '" + KdPel + "'";
            Connection Conn = (Connection) DriverManager.getConnection(DB_Koneksi, DB_Username, DB_Password);
            Statement Stmt = Conn.createStatement();
            ResultSet RS = Stmt.executeQuery(SQL);;
            if(!RS.next()){
                 JOptionPane.showMessageDialog(rootPane, "Kode Pelanggan tidak ditemukan.",
                         "Informasi", JOptionPane.INFORMATION_MESSAGE);
                 jTextField_Kdpel.setText("");
                 jTextField_Kdpel.requestFocus();
                 return;                
            }            
            JOptionPane.showMessageDialog(rootPane, "Kode Pelanggan ditemukan.",
                    "Informasi", JOptionPane.INFORMATION_MESSAGE);
            jTextField_Nama.setText(RS.getString("pel_nama"));
            jTextField_Telp.setText(RS.getString("pel_telp"));
            jTextArea_Alamat.setText(RS.getString("pel_alamat"));
            jComboBox_Status.setSelectedIndex(Integer.parseInt(RS.getString("pel_kawin")));
            if(RS.getString("pel_jk").equals("1")){
                jRadioButton_Pria.setSelected(true);             
            } else {
                jRadioButton_Wanita.setSelected(true);
            }
            Stmt.close();
            Conn.close();            
         } catch (SQLException e) {
             e.printStackTrace();
         }    
    }//GEN-LAST:event_jButton_CariActionPerformed

    private void jButton_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddActionPerformed
        // TODO add your handling code here:
        Bersih();
        jTextField_Kdpel.requestFocus();
    }//GEN-LAST:event_jButton_AddActionPerformed

    private void jButton_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SaveActionPerformed
        // TODO add your handling code here:
        if(Cek_Kode() == false){ return; }    
        String KdPel = jTextField_Kdpel.getText();
        String NmPel = jTextField_Nama.getText();
        String Alamat = jTextArea_Alamat.getText();
        String Telp = jTextField_Telp.getText();
        String Status = String.valueOf(jComboBox_Status.getSelectedIndex());
        String JK;
        if(jRadioButton_Pria.isSelected()){ JK = "1"; } else { JK = "0"; }
        Calendar Cal = Calendar.getInstance();
        SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String TanggalJam = SDF.format(Cal.getTime());                
        String SQL;
        Connection Conn;
        Statement Stmt;
        ResultSet RS;
        try {
            SQL = "SELECT * FROM pelanggan WHERE kdpel = '" + KdPel + "'";
            Conn = (Connection) DriverManager.getConnection(DB_Koneksi, DB_Username, DB_Password);
            Stmt = Conn.createStatement();
            RS = Stmt.executeQuery(SQL);
            if(RS.next()){
                JOptionPane.showMessageDialog(rootPane, "Kode Pelanggan sudah digunakan.",
                    "Informasi", JOptionPane.INFORMATION_MESSAGE);
                jTextField_Kdpel.requestFocus();
                return;
            }
            RS.close();   
            SQL = "INSERT INTO pelanggan (";
            SQL += "kdpel,";                    //1
            SQL += "pel_nama,";                 //2
            SQL += "pel_jk,";                   //3
            SQL += "pel_alamat,";               //4
            SQL += "pel_telp,";                 //5
            SQL += "pel_kawin,";                //6
            SQL += "pel_create,";               //7
            SQL += "pel_update";                //8
            SQL += ") VALUES (";
            SQL += "'" + KdPel + "',";          //1
            SQL += "'" + NmPel + "',";          //2
            SQL += "'" + JK + "',";             //3
            SQL += "'" + Alamat + "',";         //4
            SQL += "'" + Telp + "',";           //5
            SQL += "'" + Status + "',";         //6
            SQL += "'" + TanggalJam + "',";     //7
            SQL += "'" + TanggalJam + "'";      //8
            SQL += ")";
            Stmt = Conn.createStatement();
            Stmt.executeUpdate(SQL);
            Stmt.close();
            Conn.close();
            JOptionPane.showMessageDialog(rootPane, "Input data berhasil.",
                    "Informasi", JOptionPane.INFORMATION_MESSAGE);
            Bersih();
            jTextField_Kdpel.requestFocus();
         } catch (SQLException e) {
             e.printStackTrace();
         }
    }//GEN-LAST:event_jButton_SaveActionPerformed

    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed
        // TODO add your handling code here:
        if(Cek_Kode() == false){ return; }       
        String KdPel = jTextField_Kdpel.getText();
        String NmPel = jTextField_Nama.getText();
        String Alamat = jTextArea_Alamat.getText();
        String Telp = jTextField_Telp.getText();
        String Status = String.valueOf(jComboBox_Status.getSelectedIndex());
        String JK;
        if(jRadioButton_Pria.isSelected()){ JK = "1"; } else { JK = "0"; }
        Calendar Cal = Calendar.getInstance();
        SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String TanggalJam = SDF.format(Cal.getTime()); 
        String SQL = "";
        try {      
            //=========================SQL Update=========================================//
            SQL = "UPDATE pelanggan SET ";
            SQL += "pel_nama = '" + NmPel  + "', ";
            SQL += "pel_jk = '" + JK  + "', ";
            SQL += "pel_alamat = '" + Alamat  + "', ";
            SQL += "pel_telp = '" + Telp  + "', ";
            SQL += "pel_kawin = '" + Status  + "', ";
            SQL += "pel_update = '" + TanggalJam  + "' ";
            SQL += "WHERE kdpel = '" + KdPel + "'";
            //============================================================================//       
            Connection Conn = (Connection) DriverManager.getConnection(DB_Koneksi, DB_Username, DB_Password);
            Statement Stmt = Conn.createStatement();
            Stmt.executeUpdate(SQL);
            Stmt.close();
            Conn.close();            
            JOptionPane.showMessageDialog(rootPane, "Data berhasil diupdate.",
                    "Informasi", JOptionPane.INFORMATION_MESSAGE);
            Bersih();
            jTextField_Kdpel.requestFocus();
         } catch (SQLException e) {
             e.printStackTrace();
         }    
    }//GEN-LAST:event_jButton_UpdateActionPerformed

    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
        // TODO add your handling code here:
        if(Cek_Kode() == false){ return; }
        int Pilihan;
        String SQL = "";
        Pilihan = JOptionPane.showConfirmDialog(rootPane, "Yakin mw menghapus record?", 
                "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if(Pilihan == 0){
            String KdPel = jTextField_Kdpel.getText();
            try {      
                SQL = "DELETE FROM  pelanggan ";
                SQL += "WHERE kdpel = '" + KdPel + "'";
                Connection Conn = (Connection) DriverManager.getConnection(DB_Koneksi, DB_Username, DB_Password);
                Statement Stmt = Conn.createStatement();
                Stmt.executeUpdate(SQL);
                Stmt.close();
                Conn.close();            
                JOptionPane.showMessageDialog(rootPane, "Data berhasil didelete.",
                        "Informasi", JOptionPane.INFORMATION_MESSAGE);
                Bersih();
                jTextField_Kdpel.requestFocus();
            } catch (SQLException e) {
                 e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton_DeleteActionPerformed

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
            java.util.logging.Logger.getLogger(UAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UAS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_JK;
    private javax.swing.JButton jButton_Add;
    private javax.swing.JButton jButton_Cari;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Exit;
    private javax.swing.JButton jButton_Save;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JComboBox jComboBox_Status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton_Pria;
    private javax.swing.JRadioButton jRadioButton_Wanita;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_Alamat;
    private javax.swing.JTextField jTextField_Kdpel;
    private javax.swing.JTextField jTextField_Nama;
    private javax.swing.JTextField jTextField_Telp;
    // End of variables declaration//GEN-END:variables
}
