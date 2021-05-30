package lessons32;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCWriteExample {

    public static void main(String[] args) {

        String insert = "insert into user (idUser, FirstName, LastName) values (?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/AlexandrDatabase", "root", "2S90a55sh94A")) {

            if (connection != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }

            PreparedStatement preparedStatement = connection.prepareStatement(insert);

            preparedStatement.setInt(1, 5);
            preparedStatement.setString(2, "Roman");
            preparedStatement.setString(3, "Slavikovsky");

            int row = preparedStatement.executeUpdate();
            System.out.println(row);

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}