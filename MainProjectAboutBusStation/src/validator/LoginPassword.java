package validator;
import form.User;

import java.util.List;

public class LoginPassword {

    public int CheckLoginPassword(List<User> userInfo, String login, String password){
        User tempUser = new User();
        for( User user : userInfo ){
            if(user.getLogin().equals(login) && user.getPassword().equals(password)){
                tempUser.setType(user.getType());
            }
        }
        return tempUser.getType();
    }
}
