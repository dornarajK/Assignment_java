package Inheritance3_1.apeHierarchyandPolymorphism_3;

public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle (double basem, double height){
        this.base = basem;
        this.height = height;
    }
    @Override
    public double calculateArea(){
        return 0.5 * base * height;
    }

    public double getBase(){
        return base;
    }

    public double getHeight(){
        return height;
    }
}
