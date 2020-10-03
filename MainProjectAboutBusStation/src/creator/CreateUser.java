package creator;

import form.User;
import input.InputInformation;

public class CreateUser {

    public User createOneUser(){
       /* String login;
        String password;
        int type;
        int balance;*/

        User user = new User();
        InputInformation cout = new InputInformation();

        user.setBalance(0);
        System.out.println("Input login: ");
        user.setLogin(cout.inputString());
        System.out.println("Input password: ");
        user.setPassword(cout.inputString());
        user.setType(0);

        return user;
    }
}
