package dao;

import creator.CreateUser;
import exception.ProgramException;
import form.User;

import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    public List<User> findAllUsers() throws ProgramException {
        List<User> users = null;
        try (Connection connection = ConnectionCreator.provideConnection();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(SqlRequest.SELECT_ALL_USERS);
            users = readUsersInfo(resultSet);
        } catch (SQLException ex) {
            throw new ProgramException(ex);
        }
        return users;
    }

    private List<User> readUsersInfo(ResultSet resultSet) throws SQLException{
        CreateUser creator = new CreateUser();
        List<User> users = new ArrayList<>();
        while (resultSet.next()) {
            String loginUser = resultSet.getString(1);
            String passwordUser = resultSet.getString(2);
            int type = resultSet.getInt(3);
            int balance = resultSet.getInt(4);
            users.add(creator.createOneUser(loginUser, passwordUser, type, balance));
        }
        return users;
    }
}
