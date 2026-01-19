package Main;


//Connecting the Database
import java.sql.*;

public class DbConnection {
    public static Connection connect() {
        Connection con = null;
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:database.db"); // path to database
            System.out.println("Connected to database successfully");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
}
