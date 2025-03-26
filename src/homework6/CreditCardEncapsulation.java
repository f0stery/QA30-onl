package homework6;

import java.util.Scanner;

public class CreditCardEncapsulation {
    private final long accountNumber;
    private double accountBalance;
    private final Scanner scanner;

    public CreditCardEncapsulation(long accountNumber, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.scanner = new Scanner (System.in);
        getWithdraw();
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    @Override
    public String toString() {
        return "Credit card number: " + accountNumber + "\n" +
                "Credit card balance: " + accountBalance + "\n";
    }

    public void getWithdraw() {

        System.out.println("Your current balance: " + getAccountBalance());
        System.out.print("Do you want to withdraw money from your credit card? (y/n): ");
        String answer = scanner.nextLine().trim();

        if (answer.equalsIgnoreCase("y")) {
            withdrawMoneyFromCreditCardAccount();
        } else if (answer.equalsIgnoreCase("n")) {
            System.out.println("Withdrawal canceled.");
        } else {
            System.out.println("Invalid input. Please enter 'y' or 'n'");
        }
        System.out.println("-------------");
    }

    public void withdrawMoneyFromCreditCardAccount() {
        System.out.println("Please, enter how many money you want to withdraw?: ");
        double value = scanner.nextDouble();
        scanner.nextLine();

        if (value > accountBalance) {
            System.out.println("You don't have enough money on the account. Your balance is: " + accountBalance);
            System.out.println("You wanted to withdraw: " + value);
        } else {
            accountBalance -= value;
            System.out.println("You have withdrawn this amount of money: " + value +
                    ". Your balance is: " + accountBalance);
        }
    }

    public void closeScanner() {
        scanner.close();
    }
}
