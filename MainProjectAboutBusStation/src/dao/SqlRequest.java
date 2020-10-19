package dao;

public class SqlRequest {
    public static final String ADD_USER = "INSERT users(userLogin, userPassword, prior, balance) VALUES (?, ?, ?, ?)";
    public static final String REMOVE_USER_BY_LOGIN = "DELETE FROM users WHERE userLogin = ?";
    public static final String SELECT_ALL_USERS = "SELECT userLogin, userPassword, prior, balance FROM users";
    public static final String ADD_BUS = "INSERT busstation(nameBusStation, numberOfBus, countOfTicket, typeOfBus, costTicket) VALUES (?, ?, ?, ?, ?)";
    public static final String REMOVE_BUS_BY_NUMBER = "DELETE FROM busstation WHERE numberOfBus = ?";
    public static final String SELECT_ALL_ROUTE = "SELECT nameBusStation, numberOfBus, countOfTicket, typeOfBus, costTicket FROM busstation";

}
