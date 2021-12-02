package views;

import controllers.LoginController;

public class LoginView {

    public void displayLoginScreen() {
        LoginController lc = new LoginController();
        //greeting
        System.out.println("Hi, Welcome to the Bank");
        //ask for username - call a method from the LoginController
        System.out.println("Please enter your Username: ");
        lc.getUsername();
        //ask for password - call a method from the LoginController
        System.out.println("Please enter your Password: ");
        lc.getPassword();
        //if un & pw  correct go to mainmenu
        if(lc.checkDetails()){
            System.out.println("Correct details entered.");
            System.out.println("Going to Main Menu.");
            lc.loadMainMenu();
        }
        else {
            //incorrect un and/or PW - try again.
            System.out.println("Incorrect Username and/or Password, please try again.");
            displayLoginScreen();
        }


    }










}
