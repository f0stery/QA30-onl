package homework_6.ATM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM(10, 10, 10); // 20x10, 50x10, 100x10
        atm.addMoney(5, 5, 5);

        while (true){

            System.out.print("Please, enter sum for dispensed money (0 - to stop): ");
            int amount = scanner.nextInt();

            if (amount == 0) {
                System.out.println("Dispense completed.");
                break;
            }

            if (amount < 0) {
                System.out.println("Error. Sum cannot be negative");
                continue;
            }

            atm.withdraw(amount);
        }

        scanner.close();
    }
}
