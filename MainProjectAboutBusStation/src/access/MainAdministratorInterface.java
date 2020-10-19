package access;

import dao.BusDAOImplement;
import dao.UsersListDAOImplement;
import exception.ProgramException;
import input.ConsoleReader;
import service.WorkBusStation;
import service.WorkWithUser;


public class MainAdministratorInterface {

    public void mainAdminInterface() throws ProgramException {

        ConsoleReader input = new ConsoleReader();
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


    public void userInterface() throws ProgramException {
        WorkWithUser user = new WorkWithUser();
        ConsoleReader input = new ConsoleReader();
        UsersListDAOImplement usersDAO = new UsersListDAOImplement();
        int kod = 123;

        while(kod != 0) {
            System.out.println("1 - add user \n2 - delete user \n3 - show users \n4 - change user\nanother - exit");
            kod = input.inputInt();
            switch (kod) {
                case 1:
                    user.addUserDAO();
                    break;
                case 2:
                    user.deleteUserDAO();
                    break;
                case 3:
                    user.showUserInformation(usersDAO.findAllUsers());
                    break;
                case 4:
                default:
            }
        }

    }

    public void busInterface() throws ProgramException {
        WorkBusStation bus = new WorkBusStation();
        ConsoleReader input = new ConsoleReader();
        BusDAOImplement busDao = new BusDAOImplement();
        int kod = 123;
        while(kod != 0) {
            System.out.println("1 - add bus \n2 - delete bus \n3 - show information \n4 - change bus\nanother - exit");
            kod = input.inputInt();
            switch (kod) {
                case 1:
                    bus.addBus();
                    break;
                case 2:
                    bus.deleteBus();
                    break;
                case 3:
                    bus.showBusInformation(busDao.findAllBuses());
                    break;
                case 4:
                    //bus.changeInformationOfBus(busInformation.getBusInformation());
                    break;
                default:
            }
        }

    }


}
//System.out.println("1 - add bus \n2 - delete bus \n3 - show information \n4 - change bus\n5 - show user\n6 - add user \nanother - exit");
