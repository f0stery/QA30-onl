package homework_8;

public class Rectangle extends Shape {

    private double height;
    private double weight;


    public Rectangle(double height, double weight) {
        this.height = height;
        this.weight = weight;

    }

    @Override
    public double calculatePerimeter() {
        return 2 * (height * weight);
    }

    @Override
    public double calculateArea() {
        return height * weight;
    }


}
