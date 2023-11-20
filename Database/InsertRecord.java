import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecord {
   public static void main(String[] args) {
      String URl = "jdbc:mysql://localhost:3306/my_db";
      String username = "root";
      String password = "password";
      try {
         Connection con = DriverManager.getConnection(URl, username, password);
         Statement stm = con.createStatement();

         // create table
         String query = "insert into student(id,name,age,class) values (1,'suraj',19,'Bca')";
         stm.execute(query);
         System.out.println("Table Created Successfully");
      } catch (Exception e) {
         System.out.println(e);
      }
   }
}
