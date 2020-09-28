package service;

import creator.CreateBus;
import form.BusStation;

import java.util.List;
import java.util.Scanner;

public class WorkBusStation {


    public WorkBusStation() {
        super();
    }

    public void addBus(List<BusStation> busses){
        CreateBus bus = new CreateBus();
        BusStation newBus = new BusStation();
        newBus = bus.createOneBus();
        busses.add(newBus);
    }

    public void showBusInformation(List<BusStation> busses){
        int number = 1;
        for( BusStation bus : busses ){
            System.out.print(number + ")");
            System.out.println(bus.toString());
            number++;
        }
    }

    public void deleteBus(List<BusStation> busses){
        int number;
        Scanner in = new Scanner(System.in);
        WorkBusStation tempBus = new WorkBusStation();
        tempBus.showBusInformation(busses);
        System.out.println("Input number for delete: ");
        number = in.nextInt();
        try {
            busses.remove(number);
        } catch (IndexOutOfBoundsException e) {
            //e.printStackTrace();
            System.out.println("found a problem");
        }
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


}
