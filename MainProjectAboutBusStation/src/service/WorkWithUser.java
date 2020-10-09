package service;

import creator.CreateBus;
import creator.CreateUser;
import dao.UsersListDAOImplement;
import form.BusStation;
import form.User;
import input.InputInformation;

import java.util.List;
import java.util.Scanner;

public class WorkWithUser {

    public void addUser(List<User> users){
        CreateUser user = new CreateUser();
        User newUser = new User();
        newUser = user.createOneUser();
        users.add(newUser);
    }

    public void addUserDAO(){
        UsersListDAOImplement userDAO = new UsersListDAOImplement();
        CreateUser userCreate = new CreateUser();
        User user = new User();
        user = userCreate.createOneUser();
        userDAO.addUser(user);
    }

    public void deleteUser(List<User> users){
        int number;
        WorkWithUser tempUser = new WorkWithUser();
        InputInformation input = new InputInformation();
        tempUser.showUserInformation(users);
        System.out.println("Input number for delete: ");
        number = input.inputInt();
        try {
            users.remove(number);
        } catch (IndexOutOfBoundsException e) {
            //e.printStackTrace();
            System.out.println("found a problem, we can not removing this user!");
        }
    }

    public void deleteUserDAO(List<User> users){
        int number;
        WorkWithUser tempUser = new WorkWithUser();
        InputInformation input = new InputInformation();
        tempUser.showUserInformation(users);
        System.out.println("Input number for delete: ");
        number = input.inputInt();
        try {
            users.remove(number);
        } catch (IndexOutOfBoundsException e) {
            //e.printStackTrace();
            System.out.println("found a problem, we can not removing this user!");
        }
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
