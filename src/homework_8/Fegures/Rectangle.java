package homework_8.Fegures;

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

    @Override
    public String toString() {
        return "Rectangle with height: " + height +
                ", width: " + weight +
                ", area: " + calculateArea() +
                ", perimeter: " + calculatePerimeter();
    }
}
