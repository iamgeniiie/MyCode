package Banking;

// In this class I was able to identify all of the variables and methods
// that were used for the customers account.

public class Registration {

    private final String firstName;
    private final String lastName;
    private double balance;
    private final String id;


    // I used the class in a list so I made a method for the class
    public Registration(String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = 0.0;
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName + "";
    }

    public String getLastName() {
        return this.lastName + "";
    }

    public double getBalance() {
        return this.balance;
    }


    public String getID() {
        return this.id + "";
    }

    public void depositMoney(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("You have deposited " + depositAmount + " to your account." + "\n" + "Balance is now: " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.balance < withdrawalAmount) {
            System.out.println("Insufficient funds.");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("You have withdrawal " + withdrawalAmount + " from your account." + "\n" + "Balance is now: " + this.balance);
        }
    }

    @Override
    public String toString() {
        return "First name: " + getFirstName() + "\n" +
                "Last name: " + getLastName() + "\n" +
                "Balance: " + getBalance() + "\n" +
                "ID: " + getID();
    }
}