package dao;

import form.User;

import java.sql.*;
import java.sql.SQLException;

public class UsersListDAOImplement {

    public void addUser(User user){
        try (Connection connection = ConnectionCreator.provideConnection();
            PreparedStatement statement = connection.prepareStatement(SqlRequest.ADD_USER)) {
            System.out.println("Input login: ");
            statement.setString(1, user.getLogin());
            System.out.println("Input password: ");
            statement.setString(2, user.getPassword());
            statement.setInt(3, 0);
            //statement.setInt(3, user.getType());
            //statement.setInt(4, user.getBalance());
            statement.setInt(4, 0);

            statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("We have problem with connection");
        }
    }
}
