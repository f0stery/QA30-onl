package homework_8;

import javax.swing.plaf.synth.SynthOptionPaneUI;

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

        System.out.println("Сумма периметров всех фигур: " + totalPerimeter);
    }
}
