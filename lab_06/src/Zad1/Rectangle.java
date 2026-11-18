package Zad1;

public class Rectangle extends Shape{
    private double width;
    private  double height;

    public Rectangle(double width, double height,String name){
        super(name);
        this.width = width;
        this.height = height;
        System.out.println("Konstruktor Rectangle: "+name);
    }
    @Override
    public double area(){
        return width * height;
    }
}
