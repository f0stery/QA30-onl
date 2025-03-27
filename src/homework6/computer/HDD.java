package homework6.computer;

public class HDD {
    private String name;
    private int capacity;
    private String type;


    public HDD() {
        this.name = "Unknown";
        this.capacity = 0;
        this.type = "Internal";
    }

    public HDD(String nameHDD, int capacityHDD, String typeHDD) {
        this.name = nameHDD;
        this.capacity = capacityHDD;
        this.type = typeHDD;
    }

    public String getFullInfo() {
        return "HDD:" + "\n" +
                "\tName: " + this.name + "\n" +
                "\tCapacity: " + this.capacity + "GB\n" +
                "\tType: " + this.type;
    }
}
