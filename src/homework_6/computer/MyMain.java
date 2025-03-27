package homework_6.computer;

public class MyMain {
    public static void main(String[] args){

        Computer computer1 = new Computer(999.99, "Lenovo");
        System.out.println("Computer 1:");
        System.out.println(computer1.getFullInfo());

        System.out.println("\n----------------\n");

        RAM customRAM = new RAM("Corsair", 32);
        HDD customHDD = new HDD("Western Digital", 2000, "Internal");
        Computer computer2 = new Computer(1999.99, "Alienware", customRAM, customHDD);
        System.out.println("Computer 2:");
        System.out.println(computer2.getFullInfo());

    }
}
