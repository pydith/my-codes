// import java.sql.*;
// public class Mysql {
//     public static void main(String[] args) {
//         try{
//             Class.forName("com.mysql.jdbc.jc.jdbc.Driver");
//             Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/satya", "root", "M1racle@!23");
//             Statement statement = con.createStatement();
//             ResultSet resultSet = statement.executeQuery("SELECT * FROM employees");
//             resultSet.close();
//             statement.close();
//             con.close();
            


//         }
//          catch(Exception e){
//           e.printStackTrace();
//          }
//     }
// }
import java.sql.*;

public class Mysql {
    public static void main(String[] args) {
        // Load MySQL JDBC driver
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/satya", "root", "M1racle@123");

            // Create a statement
            Statement statement = connection.createStatement();
            
            // Execute a query
            ResultSet resultSet = statement.executeQuery("SELECT * FROM EMPLOYEE");

            // Process the result
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("employee_id") + " - " + resultSet.getString("employee_name"));
            }

            // Close resources
            resultSet.close();
            statement.close();
            connection.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
