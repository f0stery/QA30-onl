package homework6;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {

        CreditCardEncapsulation firstCard =
                new CreditCardEncapsulation(6532_2341_4314_1332L, 115023.23);



        firstCard.getWithdraw();
        firstCard.closeScanner();
    }
}
