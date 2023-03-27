package penjualan;

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
public class Latihan5 extends javax.swing.JFrame {

    private final String DB_Username = "root";
    private final String DB_Password = "";
    private final String DB_Koneksi = "jdbc:mysql://localhost/dbjual";
    
    public Latihan5() {
        initComponents();
        Atur_Combo();
        Bersih();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_Garansi = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_Kdbar = new javax.swing.JTextField();
        jTextField_Nmbar = new javax.swing.JTextField();
        jTextField_Harga = new javax.swing.JTextField();
        jTextField_Stok = new javax.swing.JTextField();
        jComboBox_Kategori = new javax.swing.JComboBox();
        jButton_Simpan = new javax.swing.JButton();
        jButton_Keluar = new javax.swing.JButton();
        jRadioButton_Ya = new javax.swing.JRadioButton();
        jRadioButton_Tidak = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        jLabel1.setText("Menyimpan Data");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("Kode Barang");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("Nama Barang");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setText("Harga");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setText("Stok");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setText("Kategori");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setText("Garansi");

        jComboBox_Kategori.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton_Simpan.setFont(new java.awt.Font("Ravie", 0, 16)); // NOI18N
        jButton_Simpan.setText("Simpan");
        jButton_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SimpanActionPerformed(evt);
            }
        });

        jButton_Keluar.setFont(new java.awt.Font("Ravie", 0, 16)); // NOI18N
        jButton_Keluar.setText("Keluar");
        jButton_Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_KeluarActionPerformed(evt);
            }
        });

        buttonGroup_Garansi.add(jRadioButton_Ya);
        jRadioButton_Ya.setText("Ya");

        buttonGroup_Garansi.add(jRadioButton_Tidak);
        jRadioButton_Tidak.setText("Tidak");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jButton_Simpan))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Keluar)
                            .addComponent(jComboBox_Kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Kdbar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Nmbar, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Harga, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_Stok, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton_Ya)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton_Tidak))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_Kdbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_Nmbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_Harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Simpan)
                    .addComponent(jButton_Keluar))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(464, 392));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SimpanActionPerformed
        // TODO add your handling code here:
         try {
                String SQL;
                Connection Conn;
                Statement Stmt;
                ResultSet RS;
                Conn = (Connection) DriverManager.getConnection(DB_Koneksi, 
                        DB_Username, DB_Password);
                String Kode_Barang = jTextField_Kdbar.getText();
                String Nama_Barang = jTextField_Nmbar.getText();
                String Harga = jTextField_Harga.getText();
                String Stok = jTextField_Stok.getText(); 
                String Kategori = jComboBox_Kategori.getSelectedItem().toString();
                String Garansi;
                if(jRadioButton_Ya.isSelected()){
                    Garansi = "1";
                } else {
                    Garansi = "0";
                }
                
                Calendar Cal = Calendar.getInstance();
                SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String TanggalJam = SDF.format(Cal.getTime());                
                SQL = "SELECT * FROM barang WHERE kdbrg = '" + Kode_Barang + "'";
                Stmt = Conn.createStatement();
                RS = Stmt.executeQuery(SQL);
                if(Kode_Barang.equals("")){
                    JOptionPane.showMessageDialog(rootPane, "Kode Barang tidak boleh kosong",
                            "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                if(RS.next()){
                     JOptionPane.showMessageDialog(rootPane, "Kode Barang sudah digunakan.",
                             "Informasi", JOptionPane.INFORMATION_MESSAGE);
                     return;
                }
                RS.close();
                
                SQL = "INSERT INTO barang (";
                SQL += "kdbrg,";                    //1
                SQL += "brg_nama,";                 //2
                SQL += "brg_harga,";                //3
                SQL += "brg_stok,";                 //4
                SQL += "brg_kategori,";             //5
                SQL += "brg_garansi,";              //6
                SQL += "brg_create,";               //7
                SQL += "brg_update";                //8
                SQL += ") VALUES (";
                SQL += "'" + Kode_Barang + "',";    //1
                SQL += "'" + Nama_Barang + "',";    //2
                SQL += "'" + Harga + "',";          //3
                SQL += "'" + Stok + "',";           //4
                SQL += "'" + Kategori + "',";       //5
                SQL += "'" + Garansi + "',";        //6
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
                jTextField_Kdbar.requestFocus();
         } catch (SQLException e) {
             e.printStackTrace();
         }    
    }//GEN-LAST:event_jButton_SimpanActionPerformed

    private void jButton_KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_KeluarActionPerformed
        // TODO add your handling code here:
        int Pilihan;
        Pilihan = JOptionPane.showConfirmDialog(rootPane, "Yakin mw keluar?", 
                "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if(Pilihan == 0){
            dispose();
        }
    }//GEN-LAST:event_jButton_KeluarActionPerformed
 
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
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan5().setVisible(true);              
            }
        });       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_Garansi;
    private javax.swing.JButton jButton_Keluar;
    private javax.swing.JButton jButton_Simpan;
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
