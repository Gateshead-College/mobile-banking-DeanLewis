package views;

import java.util.Scanner;

public class MainMenuView {

    public int displayMenu(){
        System.out.println("Please select an option from below:");
        System.out.println("1 - View accounts");
        System.out.println("2 - Open a new Account");
        System.out.println("3 - Logout");
        return Integer.parseInt(new Scanner(System.in).nextLine());
    }
}
