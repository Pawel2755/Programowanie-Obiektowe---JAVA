public class Main {
    public static void main(String[] args){

//ZADANIE 1
    //1.Pole firstName ma modyfikator dostępu private w klasie Person. Oznacza to, że jest widoczne wyłącznie wewnątrz klasy Person.
    //2.Pole lastName ma modyfikator dostępu protected. Pole z tym modyfikatorem jest bezpośrednio widoczne w klasie bazowej, we wszystkich klasach po niej dziedziczących.
    //3.Nie

//ZADANIE 2

    System.out.printf("ZADANIE 2");
    System.out.printf("%n");
    //Employee e1 = new Employee();
    //e1.testAccess();
    Other o1 = new Other();
    o1.testAccess();
    System.out.printf("%n");

//ZADANIE 3

    System.out.println("ZADANIE 3");
    System.out.printf("%n");
    Car car = new Car("Toyota", "Corolla", 5);
    car.showInformation();
    System.out.printf("%n");

//ZADANIE 4

    System.out.println("ZADANIE 4");
    new C();
    System.out.printf("%n");

//ZADANIE 5

    System.out.println("ZADANIE 5");
    Animal a1 = new Animal();
    Dog dog = new Dog();
    Cat cat = new Cat();
    Cow cow = new Cow();
    a1.makeSound();
    dog.makeSound();
    cat.makeSound();
    cow.makeSound();
    System.out.printf("%n");

//ZADANIE 6
        System.out.println("ZADANIE 6");
        Manager manager = new Manager("Jan Kowalski", 6200.0, "HR");
        manager.showInformation();
        System.out.printf("%n");


//ZADANIE 7

        System.out.println("ZADANIE 7");
        Laptop l1 = new Laptop("HP",8,48);
        l1.powerOn();
        l1.runDiagnostics();
        l1.checkBatteryStatus();
        System.out.printf("%n");

//ZADANIE 8

        System.out.println("ZADANIE 8");
        Book b1 = new Book("ABC","DEF",1234);
        System.out.println(b1);
        System.out.println(b1.getClass());
        System.out.printf("%n");

//ZADANIE 9

        System.out.println("ZADANIE 9");
        RPG g1 = new RPG();
        g1.initialize();
        g1.start();
        System.out.printf("%n");


//ZADANIE 10
        System.out.println("ZADANIE 10");
        Report r1 = new Report("Raport",67);
        Report kopia = r1.copy();
        System.out.println("Oryginal: "+ r1.getTitle()+"liczba stron:"+r1.getPageCount());
        System.out.println("kopia: "+ kopia.getTitle()+"liczba stron:"+kopia.getPageCount());
        System.out.printf("%n");

//ZADANIE 11

        System.out.println("ZADANIE 11");
        Person1 p1 = new Person1("Adam Nowak");
        Student s1 = new Student("Jan Kowalski",123456);
        p1.showInformation();
        s1.showInformation();
        System.out.printf("%n");

//ZADANIE 12

        System.out.println("ZADANIE 12");
        Car1 auto = new Car1("Toyota",200,5);
        Motorcycle motor = new Motorcycle("Suzuki",230,false);
        Truck tir = new Truck("MAN",140,20);
        auto.startEngine();
        auto.displayInfo();
        System.out.println(auto);
        motor.startEngine();
        motor.displayInfo();
        tir.startEngine();
        tir.displayInfo();








    }
}