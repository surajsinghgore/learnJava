import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Program49 {
   public static void main(String[] args) {
    String URl="jdbc:mysql://localhost:3306/my_db";
    String username="root";
    String password="Suraj@3224";
    try {
    Connection con=DriverManager.getConnection(URl, username, password);
    Statement stm=con.createStatement();

    //create table
    String query="create table student(id int primary key,name varchar(20) not null,age int,class varchar(20))";
    stm.execute(query);
    System.out.println("Table Created Successfully");
} 
catch (Exception e) {
   System.out.println(e);
}
   } 
}
