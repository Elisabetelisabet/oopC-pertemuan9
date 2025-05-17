package pertemuan.pkg9;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 *
 * @author Elisabet Serianti
 * TGL:17 mei 2025
 */
public class Pertemuan9 {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        
        dbkoneksi dbk = new dbkoneksi ();
        
        Statement st = dbk.Koneksi().createStatement();
        
        
        String sql = "SELECT * FROM mhs;";
        ResultSet rs = st.executeQuery(sql);
        
        while (rs.next()){
            
            System.out.println("Nama : "+rs.getString("NAMA"));
        }
        
    }
    
}
