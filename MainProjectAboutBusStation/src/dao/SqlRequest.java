package dao;

public class SqlRequest {
    public static final String ADD_USER = "INSERT users(userLogin, userPassword, prior) VALUES (?, ?, ?)";
    public static final String REMOVE_USER_BY_LOGIN = "DELETE FROM users WHERE loginUser = ?";
    public static final String SELECT_ALL_USERS = "SELECT userLogin, userPassword, prior FROM users";
}
