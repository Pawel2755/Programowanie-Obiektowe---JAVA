package Zad1;

public class triangle extends Shape{
    private double base;
    private double height;

    public triangle(double base,double height,String name){
        super(name);
        this.height = height;
        this.base = base;
        System.out.println("Konstruktor Triangle: "+name);
    }
    @Override
    public double area(){
        return base * height * 0.5;
    }
}
