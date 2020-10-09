package access;

import dao.UsersListDAOImplement;
import entity.UsersInformation;
import exception.ProgramException;
import input.InputInformation;
import service.WorkWithUser;


public class ModeratorInterface {

    public void workingModeratorInterface() throws ProgramException {

        InputInformation input = new InputInformation();
        MainAdministratorInterface admin = new MainAdministratorInterface();
        int choose = 123;
        while(choose != 0) {
            System.out.println("1 - Work with bus \n2 - Work with user \n0 - exit");
            choose = input.inputInt();
            switch(choose){
                case 1:
                    admin.busInterface();
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
        UsersInformation usersInformation = new UsersInformation();
        InputInformation input = new InputInformation();
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
                    user.deleteUser(usersInformation.getUserInformation());
                    break;
                case 3:
                    user.showUserInformation(usersDAO.findAllUsers());
                    break;
                case 4:

                default:
            }
        }

    }

}
