package controllers;

import models.User;
import views.LoginView;

import java.util.ArrayList;

public class Startup {

    public static ArrayList<User> users;

    public static void main(String[] args) {
        Startup s = new Startup();
        s.createUsers();
    }

    private void createUsers(){
        users = new ArrayList<>();
        users.add(new User("Dean", "Lewis", "18/06/1988", 458, "Dean", "Password"));
        users.add(new User("Dave", "Grass", "01/04/1964", 1, "Davey", "P@ssword"));
        users.add(new User("Jackie", "Dowling", "18/06/1986", 999, "JDog", "P@55w0rd"));
        LoginView lv = new LoginView();
        lv.displayLoginScreen();
    }
}
