package homework_6.creditCard;

public class CreditCard {
    private final long accountNumber;
    private double balance;

    public CreditCard(long accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Deposit amount must be positive");
            return;
        }
        balance += amount;
        System.out.println("Deposited " + amount + " to card " + accountNumber);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive");
            return;
        }
        if (amount > balance) {
            System.out.println("Error: Insufficient money on card " + accountNumber);
            return;
        }
        balance -= amount;
        System.out.println("Withdrawn " + amount + " from card " + accountNumber);
    }

    @Override
    public String toString() {
        return "Card " + this.accountNumber + " | Balance: " + this.balance;
    }
}
