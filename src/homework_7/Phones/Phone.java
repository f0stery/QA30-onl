package homework_7.Phones;

public class Phone {
    private String number;
    private String model;
    private float weight;


    public Phone(String number, String model, float weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(){
    }

    public void receiveCall(String callerName) {
        System.out.println(callerName + " is calling!");
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println(callerName + "is calling from " + callerNumber);
    }

    public void sendMessage(String... phoneNumbers) {
        System.out.println("Sending message to: ");
        for (String num : phoneNumbers) {
            System.out.println(num);
        }
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public String getModel(){
        return model;
    }

    public float getWeight(){
        return weight;
    }

    @Override
    public String toString() {
        return "Phone Information: " + "\n" +
                "Number: " + getNumber() + "\n" +
                "Model: " + getModel() + "\n" +
                "Weight: " + getWeight();
    }
}
