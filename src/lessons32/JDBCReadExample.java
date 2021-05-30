package lessons32;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCReadExample {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        String SQL_Select = "Select * from User";

        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/AlexandrDatabase", "root", "2S90a55sh94A")) {

            if (connection != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }

            PreparedStatement preparedStatement = connection.prepareStatement(SQL_Select);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("idUser");
                String firstName = resultSet.getString("FirstName");
                String lastName = resultSet.getString("LastName");

                User user = new User();
                user.setId(id);
                user.setFirstName(firstName);
                user.setLastName(lastName);

                users.add(user);
            }

            System.out.println(users);

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
