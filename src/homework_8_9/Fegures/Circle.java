package homework_8_9.Fegures;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle with radius: " + radius +
                ", area: " + calculateArea() +
                ", perimeter: " + calculatePerimeter();
    }
}
