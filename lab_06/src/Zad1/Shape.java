package Zad1;

public abstract class Shape {
    private String name;

    public Shape(String name){
        this.name =name;
        System.out.println("Konstruktor Shape: "+name);
    }
    public String getName(){
        return name;
    }
    public abstract double area();

    public void printInformation(){
        System.out.println("Figura: " + getClass().getSimpleName() + ", Pole: "+ area());
    }
}
