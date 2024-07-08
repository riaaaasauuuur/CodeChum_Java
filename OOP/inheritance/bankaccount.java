package OOP.inheritance;

import java.util.Scanner;

class BankAccount {
    protected String number;
    protected double balance;

    public BankAccount(String number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.printf("Deposit: %.2f, New Balance: %.2f%n", amount, balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Balance not enough.");
        } else {
            balance -= amount;
            System.out.printf("Withdraw: %.2f, New Balance: %.2f%n", amount, balance);
        }
    }
}

class SavingsAccount extends BankAccount {
    private double interest;

    public SavingsAccount(String number, double balance, double interest) {
        super(number, balance);
        this.interest = interest;
    }

    @Override
    public void deposit(double amount) {
        double interestAmount = amount * interest;
        balance += amount + interestAmount;
        System.out.printf("Deposit: %.2f, New Balance: %.2f%n", amount, balance);
    }
}

class CheckingAccount extends BankAccount {
    private double limit;

    public CheckingAccount(String number, double balance, double limit) {
        super(number, balance);
        this.limit = limit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > limit) {
            System.out.println("Limit exceeded!");
        } else if (amount > balance) {
            System.out.println("Balance not enough.");
        } else {
            balance -= amount;
            System.out.printf("Withdraw: %.2f, New Balance: %.2f%n", amount, balance);
        }
    }
}

public class bankaccount{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose the type of account: ");
        int accountType = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter the account number: ");
        String accountNumber = scanner.nextLine();

        BankAccount account;

        if (accountType == 1) {
            System.out.print("Enter the interest rate: ");
            double interest = scanner.nextDouble();
            account = new SavingsAccount(accountNumber, 0, interest);
        } else {
            System.out.print("Enter the withdrawal limit: ");
            double limit = scanner.nextDouble();
            account = new CheckingAccount(accountNumber, 0, limit);
        }

         System.out.println("Menu:");
         System.out.println("1. Deposit");
         System.out.println("2. Withdraw");
         System.out.println("3. Exit");

        boolean running = true;
        while (running) {
            System.out.println(" ");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter the withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
