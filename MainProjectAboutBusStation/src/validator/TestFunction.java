package validator;

import form.User;
import input.InputInformation;

import java.util.List;

public class TestFunction {

    public void test(List<User> user){
        InputInformation in = new InputInformation();
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
