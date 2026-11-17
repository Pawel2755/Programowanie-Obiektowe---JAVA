public class Main {
    public static void main(String[] args) {
//ZADANIE 1


        System.out.println("ZADANIE 1");
        Animal first = new Dog();
        Animal second = new Cat();

        first.makeSound();
        second.makeSound();
        System.out.printf("%n");
        //1.Animal typ zmiennej
        //2.Dog to typ obiektu.
        //3.Zostanie wykonana wersja z klasy dog
        //4.Nie bezpośrednio.


        //ZADANIE 2
        System.out.println("ZADANIE 2");
        Animal[] animals = new Animal[]{
                new Dog(),
                new Cat(),
                new Cow(),
                new Sheep()
        };
        for (Animal animal : animals) {
            animal.makeSound();
        }
        System.out.printf("%n");


        //ZADANIE 3
        System.out.println("ZADANIE 3");
        present(new Dog());
        //Nie potrzebujemy trzech osobnych metod ze względu na polimorfizm oraz dziedziczenie
        System.out.printf("%n");


        //ZADANIE 4
        System.out.println("ZADANIE 4");
        Employee[] employees = new Employee[]{
                new Developer("Jan"),
                new Tester("Anna"),
                new Manager("Piotr"),
                new Administrator("Katarzyna")
        };
        for (Employee emp : employees) {
            System.out.println(emp.getName() + " - Wynagrodzenie: " + emp.calculateSalary() + " PLN");
        }
        System.out.printf("%n");

        //ZADANIE 5
        System.out.println("ZADANIE 5");
        Dog dog = new Dog();
        Animal animal = dog;
        dog.makeSound();
        animal.makeSound();
        dog.setName("reksio");
        System.out.println(animal.getName());
        animal.setName("Burek");
        System.out.println(dog.getName());
        System.out.printf("%n");
        //Nie, upcasting nie tworzy nowego obiektu w pamięci

        //ZADANIE 6
        System.out.println("ZADANIE 6");

        if (first instanceof Dog) {
            Dog dog1 = (Dog) first;
            dog1.digHole();
        }
        if (second instanceof Cat) {
            Cat cat1 = (Cat) second;
            cat1.climb();
        }
        // Dog dog1 = (Dog) second;
        System.out.printf("%n");



        //ZADANIE 7
        System.out.println("ZADANIE 7");
        specialAction(first);
        specialAction(second);
        System.out.printf("%n");



        //ZADANIE 8
        System.out.println("ZADANIE 8");
        /*
      public static void makeSound(Animal animal) {
      animal.makeSound();
        }
        */
        //Nowa wersja wykorzystuje polimorfizm



        //ZADANIE 9
        System.out.println("ZADANIE 9");
        Parent object = new Child();
        System.out.println(object.value);
        System.out.println(object.getValue());
        System.out.printf("%n");
        //dla pól liczy sie zmienna
        //dla metod liczy się obiekt

        //ZADANIE 10
        System.out.println("ZADANIE 10");
        Animal animal1 = new Dog();

        identify(animal1);
        animal.makeSound();
        System.out.printf("%n");
        //1.Wybierze wersje identidy
        //2.Wykona wersje z klasy Dog

        //ZADANIE 11
        System.out.println("ZADANIE 11");

        Animal1 animal11 = new GuideDog();

        System.out.println(animal11 instanceof Animal1);
        System.out.println(animal11 instanceof Dog1);
        System.out.println(animal11 instanceof GuideDog);
        System.out.println(animal11.getClass() == Animal1.class);
        System.out.println(animal11.getClass() == Dog1.class);
        System.out.println(animal11.getClass() == GuideDog.class);
        System.out.printf("%n");

        //ZADANIE 12
        System.out.println("ZADANIE 12");
        Payment[] platnosc = new Payment[]{
                new CardPayment(),
                new BlikPayment(),
                new TransferPayment()
        };
        for (Payment payment : platnosc) {
            payment.pay(99.99);
        }
        System.out.printf("%n");

        //ZADANIE 13
        System.out.println("ZADANIE 13");

        Shape[] shapes = {
                new Circle(5.3),
                new Rectangle(3.7, 5.0),
                new Triangle(3.5, 9.3)
        };

        for (Shape shape : shapes) {
            printShape(shape);
        }
















    }
    public static void printShape(Shape shape) {
        System.out.println("Figura: " + shape.getName() + ", Pole: " + shape.area());
    }

    public static void present(Animal animal) {
        System.out.println(animal);
        animal.makeSound();
    }

    public static void specialAction(Animal animal) {
        if (animal instanceof Dog dog) {
            dog.digHole();
        } else if (animal instanceof Cat cat) {
            cat.climb();
        }
    }
    static void identify(Animal animal) {
        System.out.println("Animal");
    }
    static void identify(Dog dog) {
        System.out.println("Dog");
    }
}