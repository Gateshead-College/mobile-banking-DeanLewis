package controllers;

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
        return username.equalsIgnoreCase(correctUN) &&
                password.equals(correctPW);
    }

    public void loadMainMenu() {
        System.out.println("Loaded main menu.");
    }
}
