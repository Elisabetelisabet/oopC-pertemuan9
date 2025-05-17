package pertemuan.pkg9;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Elisabet Serianti
 * TGL: 17 mei 20205
 */
public class dbkoneksi {
    
    static String JBDC_DRIVER="com.mysql.cj.jdbc.Driver";
    static String DB_URL="jdbc:mysql://localhost/mahasiswa";
    static String DB_USER="root";
    static String DB_PASS="";
    
    public Connection koneksi () throws SQLException{
        try{
            
           Class.forName(JBDC_DRIVER);
           return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        }catch(ClassNotFoundException | SQLException err){
            System.out.println("Gagal koneksi de DBMS MYSQL");
               
        }
        
       return null;
        
        
    }
    
    
}
     
  
        
    
                      
