package homework_8.Fegures;


public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double p = calculatePerimeter() / 2; // Полупериметр
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "Triangle with sides: " + a + ", " + b + ", " + c +
                ", area: " + calculateArea() +
                ", perimeter: " + calculatePerimeter();
    }
}
