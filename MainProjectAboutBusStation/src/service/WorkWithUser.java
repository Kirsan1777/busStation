package service;

import creator.CreateUser;
import dao.UsersListDAOImplement;
import entity.User;
import exception.ProgramException;
import input.ConsoleReader;
import validator.LoginPassword;

import java.util.List;

public class WorkWithUser {

    public void addUserDAO() throws ProgramException {
        UsersListDAOImplement userDAO = new UsersListDAOImplement();
        LoginPassword check = new LoginPassword();
        CreateUser userCreate = new CreateUser();
        User user = new User();
        String result;
        user = userCreate.createOneUser();
        result = check.seeLoginDao(userDAO.findAllUsers(), user);
        if(result.equals("Error")){
            System.out.println("This login was busy!");
        }else {
            userDAO.addUser(user);
        }

    }


    public void deleteUserDAO(){
        UsersListDAOImplement userDAO = new UsersListDAOImplement();
        ConsoleReader reader = new ConsoleReader();
        String login;
        System.out.println("Input login for delete: ");
        login = reader.inputString();
        userDAO.deleteUser(login);
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


   /*public void deleteUser(List<User> users){
        int number;
        WorkWithUser tempUser = new WorkWithUser();
        ConsoleReader input = new ConsoleReader();
        tempUser.showUserInformation(users);
        System.out.println("Input number for delete: ");
        number = input.inputInt();
        try {
            users.remove(number);
        } catch (IndexOutOfBoundsException e) {
            //e.printStackTrace();
            System.out.println("found a problem, we can not removing this user!");
        }
    }*/


    /*public void addUser(List<User> users){
        CreateUser user = new CreateUser();
        User newUser = new User();
        newUser = user.createOneUser();
        users.add(newUser);
    }*/