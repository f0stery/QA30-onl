package homework6.computer;

public class RAM {
    private String name;
    private int capacity;

    public RAM() {
        this.name = "Unknown";
        this.capacity = 0;
    }

    public RAM(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getFullInfo() {
        return "RAM:" + "\n" +
                "\tName: " + this.name + "\n" +
                "\tCapacity: " + this.capacity + "GB";
    }
}
