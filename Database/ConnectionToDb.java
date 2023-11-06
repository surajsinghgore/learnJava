

import java.sql.DriverManager;

import java.sql.Connection;
/**
 *
 * @author SURAJ SINGH
 */
public class ConnectionToDb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      try {
        
   
    String URl="jdbc:mysql://localhost:3306/my_db";
    String username="root";
    String password="Suraj@3224";
    Connection con=DriverManager.getConnection(URl, username, password);
    System.out.println("Successfully Connected");
     } 
    catch (Exception e) {
        System.out.println(e);
    }
    }
    
}
