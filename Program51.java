import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Program51{
    public static void main(String[] args) {
        String URl = "jdbc:mysql://localhost:3306/my_db";
        String username = "root";
        String password = "password";
        try {
            Connection con = DriverManager.getConnection(URl, username, password);
            Statement stm = con.createStatement();

            // create table
            String query = "select*from student";
            ResultSet rs=stm.executeQuery(query);
           System.out.println("Fetching Data From Database");
while(rs.next()){
   int id=rs.getInt("id");
   String name=rs.getString("name");
   int age=rs.getInt("age");
   String className=rs.getString("class");

   System.out.println(id+" "+name+" "+age+" "+className);

}


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
