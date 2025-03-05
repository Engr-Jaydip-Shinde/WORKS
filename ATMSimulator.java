import java.util.Scanner;

class ATM {
    private String accountHolderName;
    private String pin;
    private double balance;

    public ATM(String accountHolderName, String pin, double balance) {
        this.accountHolderName = accountHolderName;
        this.pin = pin;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public boolean checkPin(String enteredPin) {
        return pin.equals(enteredPin);
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return false;
        } else {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful.");
            return true;
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " successful.");
    }

    public void changePin(String oldPin, String newPin) {
        if (this.pin.equals(oldPin)) {
            this.pin = newPin;
            System.out.println("PIN changed successfully.");
        } else {
            System.out.println("Old PIN is incorrect.");
        }
    }

    public void showBalance() {
        System.out.println("Your current balance is: " + balance);
    }
}

public class ATMSimulator {

    private static ATM currentATM = null;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ATM user = new ATM("John Doe", "1234", 1000.00);
        currentATM = user;

        System.out.println("Welcome to the ATM System");

        while (true) {
            if (login()) {
                displayMenu();
                break;
            }
        }
    }

    public static boolean login() {
        System.out.print("Enter your PIN: ");
        String enteredPin = scanner.nextLine();

        if (currentATM.checkPin(enteredPin)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Incorrect PIN. Please try again.");
            return false;
        }
    }

    public static void displayMenu() {
        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Change PIN");
            System.out.println("5. Logout");

            System.out.print("Please choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    currentATM.showBalance();  
                    break;

                case 2:
                    depositMoney();  
                    break;

                case 3:
                    withdrawMoney(); 
                    break;

                case 4:
                    changePin();
                    break;

                case 5:
                    System.out.println("Logging out...");
                    System.exit(0);  
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public static void depositMoney() {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        if (amount <= 0) {
            System.out.println("Amount must be positive.");
        } else {
            currentATM.deposit(amount); 
        }
    }

    public static void withdrawMoney() {
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); 

        if (amount <= 0) {
            System.out.println("Amount must be positive.");
        } else {
            currentATM.withdraw(amount);  
        }
    }

    public static void changePin() {
        System.out.print("Enter your old PIN: ");
        String oldPin = scanner.nextLine();

        System.out.print("Enter your new PIN: ");
        String newPin = scanner.nextLine();

        if (newPin.length() == 4) {
            currentATM.changePin(oldPin, newPin);
        } else {
            System.out.println("New PIN must be 4 digits long.");
        }
    }
}
