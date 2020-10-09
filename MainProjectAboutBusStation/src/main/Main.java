package main;

import access.MainAdministratorInterface;
import dao.ConnectionCreator;
import dao.UsersListDAOImplement;
import form.User;

import java.sql.Connection;
import java.sql.SQLException;//и чё это за фигня? Оно вообще должно так работать?


public class Main {
    public static void main(String[] args) throws SQLException {
        //Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();//AAAAAAAAAAAAAAAAAAA
        MainAdministratorInterface mainAdmin = new MainAdministratorInterface();
        UsersListDAOImplement daoUser = new UsersListDAOImplement();
        User user = new User();
        System.out.println("Welcome to bus station program!");
        ConnectionCreator connectionCreator = new ConnectionCreator();
        Connection conn = connectionCreator.provideConnection();
        mainAdmin.mainAdminInterface();
        System.out.println("Input information from add user: ");
        daoUser.addUser(user);
        conn.close();
    }
}
/*  int integer;
        String line;
        BusStation busStation = new BusStation();
        BusStationInformation busInformation = new BusStationInformation();
        busStation.addBus(busInformation.getBusInformation());
        busStation.showBusInformation(busInformation.getBusInformation());
        System.out.print("Please input integer: ");
        integer = inputInt();
        System.out.println(integer);
        System.out.print("Please input string: ");
        line = inputString();
        System.out.println(line);
        busStation.deleteBus(busInformation.getBusInformation());*/