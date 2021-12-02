package controllers;

import models.User;

import java.util.Scanner;

public class LoginController {

    private String correctUN = "Dean";
    private String correctPW = "Password";

    private String username = "";
    private String password = "";

    //get UN
    public void getUsername(){
        username = new Scanner(System.in).nextLine();
    }

    //get PW
    public void getPassword(){
        password = new Scanner(System.in).nextLine();
    }

    //compare username and password
    public boolean checkDetails(){
        for(User u : Startup.users){
            if(u.getUsername().equalsIgnoreCase(username) &&
            u.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }

    public void loadMainMenu() {
        MainMenuController mmc = new MainMenuController();
        mmc.displayMenu();
    }
}
