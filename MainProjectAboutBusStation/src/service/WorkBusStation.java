package service;

import creator.CreateBus;
import dao.BusDAOImplement;
import entity.BusStation;
import input.ConsoleReader;

import java.util.List;
import java.util.Scanner;

public class WorkBusStation {


    public WorkBusStation() {
        super();
    }

    public void addBus(){
        BusDAOImplement busDAOImplement = new BusDAOImplement();
        CreateBus bus = new CreateBus();
        BusStation newBus = new BusStation();
        newBus = bus.createOneBus();
        busDAOImplement.addBus(newBus);
    }

    public void showBusInformation(List<BusStation> busses){
        int number = 1;
        for( BusStation bus : busses ){
            System.out.print(number + ")");
            System.out.println(bus.toString());
            number++;
        }
    }

    public void deleteBus(){
        ConsoleReader reader = new ConsoleReader();
        BusDAOImplement tempBus = new BusDAOImplement();
        System.out.println("Input number bus for delete: ");
        int numberOfBus = reader.inputInt();
        tempBus.deleteBus(numberOfBus);
    }

    public void changeInformationOfBus(List<BusStation> busses){
        int number;
        Scanner in = new Scanner(System.in);
        BusStation busInformation = new BusStation();
        WorkBusStation tempBus = new WorkBusStation();
        tempBus.showBusInformation(busses);
        System.out.println("Input number for change: ");
        busInformation = busses.get(0);
        busInformation.setNameBus("Victoria");
        busses.set(0, busInformation);
        //todo how can I change information? 
    }


    public void buyTickets(){

    }


}
