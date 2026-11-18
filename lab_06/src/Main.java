import Zad1.Circle;
import Zad1.Rectangle;
import Zad1.Shape;
import Zad1.triangle;
import Zad3.Developer;
import Zad3.Employee;
import Zad3.Manager;
import Zad3.Salesperson;

public class Main {
    public static void main(String[] args) {
        //ZADANIE 1
        System.out.println("ZADANIE 1");
        Shape[] shapes = new Shape[]{
                new Circle(4.78,"Koło"),
                new Rectangle(5.78,2.67,"Prostokąt"),
                new triangle(7.66,4.91,"Trójkąt")
        };
        for(Shape shp : shapes){
           shp.printInformation();
        }
        System.out.printf("%n");

        //ZADANIE 2
        System.out.println("ZADANIE 2");
        for(Shape shp : shapes){
            shp.printInformation();
        }
        System.out.printf("%n");

        //ZADANIE 3
        System.out.println("ZADANIE 2");
        Employee[] employees = new Employee[]{
                new Developer("Jan",9000,500),
                new Manager("Adam",800,9000,5),
                new Salesperson("Karol",8000,9,600)
        };
        for(Employee emp : employees){
            emp.printPayslip();
        }





    }
}