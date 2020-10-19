package creator;

import input.ConsoleReader;
import entity.BusStation;


public class CreateBus {
    public BusStation createOneBus() {
        String nameBusStation;
        String typeOfBus;
        int numberBus;
        int countOfTicket;
        double costTicket;

        ConsoleReader in = new ConsoleReader();
        BusStation newBus = new BusStation();

        System.out.print("Please input name of bus: ");
        nameBusStation = in.inputString();
        newBus.setNameBus(nameBusStation);
        System.out.print("Please input number of bus: ");
        numberBus = in.inputInt();
        newBus.setNumberOfBus(numberBus);
        System.out.print("Please input type of bus: ");
        typeOfBus = in.inputString();
        newBus.setTypeOfBus(typeOfBus);
        System.out.print("Please input count of ticket for bus: ");
        countOfTicket = in.inputInt();
        newBus.setCountOfTicket(countOfTicket);
        System.out.print("Please input count of ticket for bus: ");
        costTicket = in.inputDouble();
        newBus.setCostTicket(costTicket);
        return newBus;
    }

    public BusStation createOneBus(String nameBus, int numberOfBus, int countOfTicket, String typeOfBus, double costTicket){
        BusStation newBus = new BusStation();
        newBus.setCountOfTicket(countOfTicket);
        newBus.setTypeOfBus(typeOfBus);
        newBus.setNameBus(nameBus);
        newBus.setNumberOfBus(numberOfBus);
        newBus.setCostTicket(costTicket);
        return newBus;
    }
}
