package Banking;

// In the main class I was able to describe how I wanted the app to run.
// I called the other classes I wanted and used their methods to make it
// run the way I wanted.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        boolean exitRequested = false;
        while(!exitRequested) {
            Menu.printMenu();
            int choice = Integer.parseInt(sc.next());
            switch (choice) {
                case 1:
                    bank.registerAccount();
                    break;
                case 2:
                    bank.loginAccount();
                    break;
                case 3:
                    exitRequested = true;
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }
    }

}
