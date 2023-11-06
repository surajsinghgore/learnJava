import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update {
    public static void main(String[] args) {
        String URl = "jdbc:mysql://localhost:3306/my_db";
        String username = "root";
        String password = "password";
        try {
            Connection con = DriverManager.getConnection(URl, username, password);
            Statement stm = con.createStatement();

            // create table
            String query = "update student set name='rahul' where id=1";
            stm.execute(query);
            System.out.println("Table Record Update Successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
