package entity;

public class BusStation {
    private String nameBus;
    private String typeOfBus;
    private int numberOfBus;
    private int countOfTicket;
    private double costTicket;

    public double getCostTicket() {
        return costTicket;
    }

    public void setCostTicket(double costTicket) {
        this.costTicket = costTicket;
    }

    public String getTypeOfBus() {
        return typeOfBus;
    }

    public void setTypeOfBus(String typeOfBus) {
        this.typeOfBus = typeOfBus;
    }

    public int getCountOfTicket() {
        return countOfTicket;
    }

    public void setCountOfTicket(int countOfTicket) {
        this.countOfTicket = countOfTicket;
    }

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
        return nameBus + "  " + numberOfBus + "  " + typeOfBus + "  " + countOfTicket +"  " + costTicket;
    }
}
