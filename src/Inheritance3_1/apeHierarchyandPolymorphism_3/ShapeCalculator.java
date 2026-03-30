package Inheritance3_1.apeHierarchyandPolymorphism_3;

public class ShapeCalculator {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(2.0),
                new Rectangle(4.0, 7.0),
                new Triangle(4.0, 8.0),
        };
        for (Shape shape : shapes) {
            if (shape instanceof Circle c) {
                System.out.println("Area of Circle with radius " + c.getRadius()
                        + ": " + c.calculateArea());

            } else if (shape instanceof Rectangle r) {
                System.out.println("Area of Rectangle with width " + r.getWidth()
                        + " and height " + r.getHeight()
                        + ": " + r.calculateArea());

            } else if (shape instanceof Triangle t) {
                System.out.println("Area of Triangle with base " + t.getBase()
                        + " and height " + t.getHeight()
                        + ": " + t.calculateArea());
            }
        }


    }
}
