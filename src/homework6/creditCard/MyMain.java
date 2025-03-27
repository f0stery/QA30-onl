package homework6.creditCard;

public class MyMain {
    public static void main(String[] args) {


        CreditCard card1 =
                new CreditCard(6532_2341_4314_1332L, 0);
        CreditCard card2 =
                new CreditCard(1112_1141_2214_8888L, 0);
        CreditCard card3 =
                new CreditCard(1231_6766_7777_6666L, 1000);

        System.out.println("Initial state:");
        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);

        System.out.println("-----------------------------------");

        card1.deposit(1500);
        card2.deposit(1000);
        card3.deposit(1000);

        System.out.println("-----------------------------------");

        card3.withdraw(2000);

        System.out.println("-----------------------------------");

        System.out.println("Final card states:");
        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
    }
}
