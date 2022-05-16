package Banking;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


// In this class I was able to put together all the variables and methods
// that will be used to identify the customers account, which will be stored
// in a list. Once identified the customer will be given option of what they
// would like to do.
public class Bank {

    private final List<Registration> bankAccounts;
    private final Scanner sc;

    public Bank() {
        bankAccounts = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public Registration isAccountExist(String accountID) {
        for (Registration account : bankAccounts) {
            if (account.getID() == accountID) {
                return account;
            }
        }
        System.out.println("One of the details is incorrect");
        return null;
    }

    public void registerAccount() {
        System.out.println("First name?");
        String firstName = sc.next();
        System.out.println("Last name?");
        String lastName = sc.next();
        System.out.println("Social security number?");
        String id = sc.next();
        if (isIDCorrect(id)) {
            bankAccounts.add(new Registration(firstName, lastName, id));
            System.out.println("You have created account successfully!" + "\n" + "Your account ID is: " + bankAccounts.get(bankAccounts.size() - 1).getID());
        }
    }

    public void loginAccount() {
        System.out.println("Please enter your ID:");
        String accountID = sc.next();
        if (isIDCorrect(accountID)) {
            Registration selectedAccount = isAccountExist(accountID);
            boolean exitRequested = false;
            while (!exitRequested) {
                Menu.existAccountMenu();
                int choice = Integer.parseInt(sc.next());
                switch (choice) {
                    case 1:
                        System.out.println(selectedAccount.toString());
                        break;
                    case 2:
                        System.out.println("Please enter deposit amount:");
                        double depositAmount = sc.nextDouble();
                        selectedAccount.depositMoney(depositAmount);
                        break;
                    case 3:
                        System.out.println("Please enter withdrawal amount:");
                        double withdrawalAmount = sc.nextDouble();
                        selectedAccount.withdrawal(withdrawalAmount);
                        break;
                    case 4:
                        exitRequested = true;
                        break;
                    default:
                        System.out.println("Wrong input.");
                        break;
                }
            }
        }
    }

    public static boolean isIDCorrect(String id) {
        if (id.length() != 9) {
            System.out.println("ID must be 9 digits.");
            return false;
        } else {
            return true;
        }
    }
}

