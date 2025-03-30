package homework_6.computer;

public class Computer {

    private final double price;
    private final String model;
    private final RAM ram;
    private final HDD hdd;


    public Computer(double price, String model) {
        this.price = price;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    public Computer(double price, String model, RAM ram, HDD hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    public String getFullInfo() {
        return "Computer Information:" + "\n" +
                "\tprice: " + price + "$" + "\n" +
                "\tmodel: " + model + "\n" +
                ram.getFullInfo() + "\n" +
                hdd.getFullInfo();
    }
}
