package access;

import entity.BusStationInformation;
import entity.UsersInformation;
import input.InputInformation;
import service.WorkBusStation;
import service.WorkWithUser;


public class MainAdministratorInterface {

    public void mainAdminInterface(){

        InputInformation input = new InputInformation();
        int choose = 123;
        while(choose != 0) {
            System.out.println("1 - Work with bus \n2 - Work with user \n0 - exit");
            choose = input.inputInt();
            switch(choose){
                case 1:
                    busInterface();
                    break;
                case 2:
                    userInterface();
                    break;
                case 0:
                default:
            }
        }
    }

    public void userInterface(){
        WorkWithUser user = new WorkWithUser();
        UsersInformation usersInformation = new UsersInformation();
        InputInformation input = new InputInformation();
        int kod = 123;
        while(kod != 0) {
            System.out.println("1 - add user \n2 - delete user \n3 - show users \n4 - change user\nanother - exit");
            kod = input.inputInt();
            switch (kod) {
                case 1:
                    user.addUser(usersInformation.getUserInformation());
                    break;
                case 2:
                    user.deleteUser(usersInformation.getUserInformation());
                    break;
                case 3:
                    user.showUserInformation(usersInformation.getUserInformation());
                    break;
                case 4:

                default:
            }
        }

    }


    public void busInterface(){
        WorkBusStation bus = new WorkBusStation();
        InputInformation input = new InputInformation();
        BusStationInformation busInformation = new BusStationInformation();
        int kod = 123;
        while(kod != 0) {
            System.out.println("1 - add bus \n2 - delete bus \n3 - show information \n4 - change bus\nanother - exit");
            kod = input.inputInt();
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
                default:
            }
        }

    }


}
//System.out.println("1 - add bus \n2 - delete bus \n3 - show information \n4 - change bus\n5 - show user\n6 - add user \nanother - exit");
