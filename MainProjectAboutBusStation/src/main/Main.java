package main;

import access.MainAdministratorInterface;
import access.ModeratorInterface;
import dao.ConnectionCreator;
import dao.UsersListDAOImplement;
import exception.ProgramException;
import form.User;
import input.InputInformation;

import java.sql.Connection;
import java.sql.SQLException;//и чё это за фигня? Оно вообще должно так работать?


public class Main {
    public static void main(String[] args) throws SQLException, ProgramException {
        MainAdministratorInterface mainAdmin = new MainAdministratorInterface();
        ModeratorInterface moderator = new ModeratorInterface();
        //UsersListDAOImplement daoUser = new UsersListDAOImplement();
        //User user = new User();
        InputInformation input = new InputInformation();
        System.out.println("Welcome to bus station program!");
        ConnectionCreator connectionCreator = new ConnectionCreator();
        Connection conn = connectionCreator.provideConnection();
        int kod = 123;
        while(kod != 0) {
            System.out.println("1 - Admin \n2 - Moderator \n3 - User \n0 - Exit");
            kod = input.inputInt();
            switch (kod) {
                case 1:
                    mainAdmin.mainAdminInterface();
                    break;
                case 2:
                    moderator.workingModeratorInterface();
                    break;
                case 3:
                    break;
                default:
            }
        }
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