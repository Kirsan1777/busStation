package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionCreator {

    public static Connection provideConnection() throws SQLException {
        Connection connection;
        String url = "jdbc:mysql://localhost/UsersInformation";
        String username = "root";
        String password = "kirsan2001";
        connection = DriverManager.getConnection(url, username, password);
        return connection;
    }

}
