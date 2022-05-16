package Banking;

// This class is just methods for the different menus that will be displayed
// for the user or customer to decide what they would like to do on the app.

public class Menu {

    public static void printMenu() {
        System.out.println("Welcome to Watson Trust Bank, press: " + "\n" +
                "\r" + "1.Apply" + "\n" +
                "\r" + "2.Log in" + "\n" +
                "\r" + "3.Exit");
    }

    public static void existAccountMenu() {
        System.out.println("What would you like to do?" + "\n" +
                "\r" + "1.Info" + "\n" +
                "\r" + "2.Deposit money" + "\n" +
                "\r" + "3.Withdrawal money" + "\n" +
                "\r" + "4.Exit");
    }
}