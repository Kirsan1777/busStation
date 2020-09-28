package service;

import creator.CreateBus;
import creator.CreateUser;
import form.BusStation;
import form.User;

import java.util.List;

public class WorkWithUser {

    public void addUser(List<User> users){
        CreateUser user = new CreateUser();
        User newUser = new User();
        newUser = user.createOneUser();
        users.add(newUser);
    }

    public void showUserInformation(List<User> users){
        int number = 1;
        for( User user : users ){
            System.out.print(number + ")");
            System.out.println(user.toString());
            number++;
        }
    }








    public WorkWithUser() {
        super();
    }



    @Override
    public String toString() {
        return "WorkWithUser{}";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
