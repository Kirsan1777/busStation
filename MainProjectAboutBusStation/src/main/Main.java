package main;

import access.MainAdministratorInterface;
import access.ModeratorInterface;
import exception.ProgramException;
import input.ConsoleReader;



public class Main {
    public static void main(String[] args) throws ProgramException {
        MainAdministratorInterface mainAdmin = new MainAdministratorInterface();
        ModeratorInterface moderator = new ModeratorInterface();
        ConsoleReader input = new ConsoleReader();
        System.out.println("Welcome to bus station program!");
        int kod = 123;
        while (kod != 0) {
            System.out.println("1 - Admin \n2 - Moderator \n3 - User \n0 - Exit");
            kod = input.inputInt();
            switch (kod) {
                case 1:
                    mainAdmin.mainAdminInterface();
                    break;
                case 2:
                    moderator.workingModeratorInterface();
                    break;
                case 3:
                    break;
                default:
            }
        }
    }
}
