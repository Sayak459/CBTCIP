import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATM {
    private double balance;
    private List<String>History;

    public ATM(double initialBalance) {
        balance = initialBalance;
        History = new ArrayList<>();
    }
    public void deposit(double amount) {
        if(amount<=0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        balance+=amount;
        String transaction ="Deposited: " + amount;
        History.add(transaction);
        System.out.println(transaction);
    }

    public void withdraw(double amount) {
        if (amount<=0 || amount>balance) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }
        balance-= amount;
        String transaction = "Withdrawn: $" + amount;
        History.add(transaction);
        System.out.println(transaction);
    }
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
    public void displayHistory() {
        System.out.println("Transaction History: $");
        for(String transaction : History) {
            System.out.println(transaction);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial balance: $");
        double initialBalance = scanner.nextDouble();
        ATM atm = new ATM(initialBalance);

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Display Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    atm.withdraw(withdrawalAmount);
                    break;
                case 3:
                    atm.displayBalance();
                    break;
                case 4:
                    atm.displayHistory();
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }
}
