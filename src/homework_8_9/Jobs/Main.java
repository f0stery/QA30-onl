package homework_8_9.Jobs;

public class Main {
    public static void main(String[] args){
        Position director = new Director();
        Position accountant = new Accountant();
        Position worker = new Worker();

        director.printPosition();
        worker.printPosition();
        accountant.printPosition();
    }
}
