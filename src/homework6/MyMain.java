package homework6;

public class MyMain {
    public static void main(String[] args){
        CreditCardEncapsulation firstCard =
                new CreditCardEncapsulation(6532_2341_4314_1332L, 115023.23);

        System.out.println(firstCard.getCreditCardFullInformation());

    }
}
