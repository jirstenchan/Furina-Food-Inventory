package Main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestConnection {
    public static void main(String[] args) {
        String username = "jirsy";
        String password = "chan";

        String query = "SELECT * FROM \"users\" WHERE username = ? AND password = ?";

        try (Connection conn = DbConnection.connect();
                PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, username);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                System.out.println("Login success!");
            } else {
                System.out.println("Login failed.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
