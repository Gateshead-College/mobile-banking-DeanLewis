package controllers;

import views.MainMenuView;

public class MainMenuController {

    public void displayMenu() {
        MainMenuView mmv = new MainMenuView();
        handleChoice(mmv.displayMenu());
    }

    private void handleChoice(int selection) {
        switch(selection){
            case 1:
                System.out.println("View accounts was selected");
                break;
            case 2:
                System.out.println("Open a new account selected");
                break;
            case 3:
                System.out.println("Logout selected");
                break;

            default:
                System.out.println("Invalid option provided, please try again.");
                displayMenu();
        }
    }
}
