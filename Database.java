import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    public static void main(String[] args) {
        String url = "1728468184861";
        String username = "root";
        String password = "M1racle@123";

        try (Connection connection = java.sql.DriverManager.getConnection(url, username, password)) {
            if (connection != null) {
                System.out.println("Connected to the database!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
