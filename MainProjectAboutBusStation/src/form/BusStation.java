package form;

public class BusStation {
    private String nameBus;
    private int numberOfBus;

    public String getNameBus() {
        return nameBus;
    }

    public void setNameBus(String nameBus) {
        this.nameBus = nameBus;
    }

    public int getNumberOfBus() {
        return numberOfBus;
    }

    public void setNumberOfBus(int numberOfBus) {
        this.numberOfBus = numberOfBus;
    }

    @Override
    public String toString() {
        return nameBus + "  " + numberOfBus;
    }
}
