package creator;

import entity.User;
import input.ConsoleReader;

public class CreateUser {

    public User createOneUser(){
        User user = new User();
        ConsoleReader cout = new ConsoleReader();
        user.setBalance(0);
        System.out.println("Input login: ");
        user.setLogin(cout.inputString());
        System.out.println("Input password: ");
        user.setPassword(cout.inputString());
        user.setType(0);
        return user;
    }

    public User createOneUser(String loginUser, String passwordUser, int type, int balance){
        User user = new User();
        user.setLogin(loginUser);
        user.setPassword(passwordUser);
        user.setType(type);
        user.setBalance(balance);
        return user;
    }
}
