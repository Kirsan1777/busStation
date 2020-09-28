package creator;

import input.InputInformation;
import form.BusStation;


public class CreateBus {
    public BusStation createOneBus() {
        String nameBus;
        int numberBus;

        InputInformation in = new InputInformation();
        BusStation newBus = new BusStation();

        System.out.print("Please input name of bus: ");
        nameBus = in.inputString();
        newBus.setNameBus(nameBus);
        System.out.print("Please input number of bus: ");
        numberBus = in.inputInt();
        newBus.setNumberOfBus(numberBus);
        return newBus;
    }

}
