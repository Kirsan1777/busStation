package validator;

import entity.User;
import input.ConsoleReader;

import java.util.List;

public class TestFunction {

    public void test(List<User> user){
        ConsoleReader in = new ConsoleReader();
        LoginPassword enter = new LoginPassword();
        String login, password;
        int type;
        System.out.println("Input login: ");
        login = in.inputString();
        System.out.println("Input password: ");
        password = in.inputString();
        type = enter.CheckLoginPassword(user, login, password);
        System.out.println("Our result is - " + type);
    }


}
