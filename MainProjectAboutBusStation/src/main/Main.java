package main;

import access.MainAdministratorInterface;


public class Main {
    public static void main(String[] args){
        MainAdministratorInterface mainAdmin = new MainAdministratorInterface();
        System.out.println("Welcome to bus station program!");
        /*ConnectionCreator connectionCreator = new ConnectionCreator();
        Connection conn = connectionCreator.provideConnection();*/
        mainAdmin.mainAdminInterface();

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