package pemrogramanjavapenjualan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Irsyad
 */
public class Latihan1 {

    public static void main(String[] args) {
        // TODO code application logic here
        String DB_Username = "root";
        String DB_Password = "";
        String DB_Koneksi = "jdbc:mysql://localhost/dbjual";
        Connection Conn = null;
        try {
            Conn = (Connection) DriverManager.getConnection(DB_Koneksi,
                    DB_Username, DB_Password);
            System.out.println("Koneksi Berhasil");
        } catch (SQLException e) {
            System.out.println("Koneksi Gagal");
        } 
    }
}
