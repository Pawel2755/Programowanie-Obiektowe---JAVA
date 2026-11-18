package Zad1;

public class Circle extends Shape{
    private double radius;
    public Circle (double radius,String name){
        super(name);
        this.radius = radius;
        System.out.println("Konstruktor Circle: "+name);

    }
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
