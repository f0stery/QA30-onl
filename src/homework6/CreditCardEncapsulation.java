package homework6;

public class CreditCardEncapsulation {
    private final long accountNumber;
    private double accountBalance;

    public CreditCardEncapsulation(long accountNumber, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    public long getAccountNumber(){
        return accountNumber;
    }

    public double getAccountBalance(){
        return accountBalance;
    }

    public String getCreditCardFullInformation(){
        withdrawMoneyFromCreditCardAccount(1000);
        return "Credit card number: " + accountNumber + "\n" +
                "Credit card balance: " + accountBalance + "\n";
    }

    public void withdrawMoneyFromCreditCardAccount(long value){
        if (value > accountBalance){
            System.out.println("You don't have enough money on the account. Your balance is: " + accountBalance);
            System.out.println("You wanted to withdraw: " + value);
        } else {
            accountBalance -= value;
            System.out.println("You have withdrawn this amount of money: " + value +
                    ". Your balance is: " + accountBalance);
        }
    }
}
