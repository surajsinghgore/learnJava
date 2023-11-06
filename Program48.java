import java.sql.Connection;
import java.sql.DriverManager;

public class Program48 {
   public static void main(String[] args) {
    String URl="jdbc:mysql://localhost:3306/my_db";
    String username="root";
    String password="password";
    try {
    Connection con=DriverManager.getConnection(URl, username, password);
    System.out.println("Successfully Connected To Database");
} 
catch (Exception e) {
   System.out.println(e);
}
   } 
}
