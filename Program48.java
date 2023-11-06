import java.sql.Connection;
import java.sql.DriverManager;

public class Program48 {
   public static void main(String[] args) {
    String URl="jdbc:mysql://localhost:3306/my_db";
    String username="root";
    String password="Suraj@3224";
    try {
    Connection con=DriverManager.getConnection(URl, username, password);
    System.out.println("Successfully Connected");
} 
catch (Exception e) {
   System.out.println(e);
}
   } 
}
