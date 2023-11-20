
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDb {
   public static void main(String[] args) {
      String URl = "jdbc:mysql://localhost:3306/";
      String username = "root";
      String password = "password";
      try {
         Connection con = DriverManager.getConnection(URl, username, password);
         Statement stm = con.createStatement();

         // query to create
         String query = "create database myDatabase";
         stm.execute(query);
         System.out.println("Database created Successfully");
      } catch (Exception e) {
         System.out.println(e);
      }
   }
}
