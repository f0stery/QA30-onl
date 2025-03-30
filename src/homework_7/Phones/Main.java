package homework_7.Phones;

public class Main {
    public static void main(String[] args){

        Phone myPhone = new Phone("+375(29)-515-23-21", "iPhone 15 pro", 187);
        Phone phone14 = new Phone("+375(29)-612-23-33", "iPhone 14");
        Phone phone13 = new Phone();

        phone14.setWeight(200);

        phone13.setNumber("555-555");
        phone13.setModel("iPhone 13");
        phone13.setWeight(240);

        System.out.println(myPhone);
        System.out.println();

        System.out.println(phone14);
        System.out.println();

        System.out.println(phone13);
        System.out.println();


        phone13.receiveCall("Evgeny");
        phone13.receiveCall("Bob", "+375(29)232-23-23");
        phone13.receiveCall("Liza");

        System.out.println();

        myPhone.sendMessage("111-111", "222-222", "333-333");

    }
}
