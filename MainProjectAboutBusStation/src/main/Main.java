package main;

import entity.BusStationInformation;
import entity.UsersInformation;
import service.WorkBusStation;
import service.WorkWithUser;
import validator.TestFunction;

import java.util.Scanner;


public class Main {
    public static void main(String[] args){



        System.out.println("Welcome to bus station program!");
        int kod = 11;
        /*ConnectionCreator connectionCreator = new ConnectionCreator();
        Connection conn = connectionCreator.provideConnection();*/

        WorkBusStation bus = new WorkBusStation();
        WorkWithUser user = new WorkWithUser();
        TestFunction testFunction = new TestFunction();
        BusStationInformation busInformation = new BusStationInformation();
        UsersInformation usersInformation = new UsersInformation();
        while(kod != 0) {
            System.out.println("1 - add bus \n2 - delete bus \n3 - show information \n4 - change bus\n5 - show user\n6 - add user \nanother - exit");
            kod = inputInt();
            switch (kod) {
                case 1:
                    bus.addBus(busInformation.getBusInformation());
                    break;
                case 2:
                    bus.deleteBus(busInformation.getBusInformation());
                    break;
                case 3:
                    bus.showBusInformation(busInformation.getBusInformation());
                    break;
                case 4:
                    bus.changeInformationOfBus(busInformation.getBusInformation());
                    break;
                case 5:
                    user.showUserInformation(usersInformation.getUserInformation());
                    break;
                case 6:
                    user.addUser(usersInformation.getUserInformation());
                    break;
                case 7:
                    testFunction.test(usersInformation.getUserInformation());
                    break;
                default:
            }
        }
    }

    public static int inputInt()
    {
        Scanner in = new Scanner(System.in);
        int numberInt = in.nextInt();

        return numberInt;
    }

    public static String inputString()
    {
        Scanner in = new Scanner(System.in);
        String inputLine;
        inputLine = in.nextLine();
        return inputLine;
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