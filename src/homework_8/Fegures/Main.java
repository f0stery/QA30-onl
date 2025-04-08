package homework_8.Fegures;

public class Main {
    public static void main(String[] args){

        Shape[] shapes = {
                new Triangle(3, 4, 5),
                new Rectangle(3, 4),
                new Circle(3),
                new Triangle(5,5,5),
                new Rectangle(2, 7)
        };

        double totalPerimeter = 0;
        for (Shape shape : shapes) {
            System.out.println(shape);
            totalPerimeter += shape.calculatePerimeter();
        }

        System.out.println("Sum of perimeters all of shapes: " + totalPerimeter);
    }
}
