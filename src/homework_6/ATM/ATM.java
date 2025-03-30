package homework_6.ATM;

public class ATM {
    private int count20;
    private int count50;
    private int count100;


    public ATM(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;

        displayBalance();
    }

    public void addMoney(int add20, int add50, int add100){

        count20 += add20;
        count50 += add50;
        count100 += add100;

        System.out.println("Money added!\n");

        displayBalance();
    }

    public void withdraw (int amount){

        int remaining = amount;

        int max100 = Math.min(remaining / 100, count100);
        remaining -= max100 * 100;

        int max50 = Math.min(remaining / 50, count50);
        remaining -= max100 * 50;

        int max20 = Math.min(remaining / 20, count20);
        remaining -= max100 * 20;

        if (remaining == 0) {
            count100 -= max100;
            count50 -= max50;
            count20 -= max20;

            System.out.println("Dispensed banknotes: " + amount);
            if (max100 > 0) System.out.println("100: " + max100);
            if (max50 > 0) System.out.println("50: " + max50);
            if (max20 > 0) System.out.println("20: " + max20);

            displayBalance();

        } else {
            System.out.println("Error: Cannot dispense " + amount);
        }
    }

    public void displayBalance() {
        System.out.println("\nCurrent ATM balance banknotes: " + "\n" +
                "20: " + count20 + "\n" +
                "50: " + count50 + "\n" +
                "100: " + count100 + "\n");
    }
}
