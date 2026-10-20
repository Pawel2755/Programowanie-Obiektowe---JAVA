public class Main {
    public static void main(String[] args) {
//ZADANIE 1
        Dog pies1 = new Dog("Burek","Kundel",3);
        Dog pies2 = new Dog("Rex", "Owczarek Niemiecki", 5);


        pies1.showInformation();
        pies1.bark();
        pies2.showInformation();
        pies2.bark();
        System.out.printf("%n");

//ZADANIE 2

        Point punkt1 = new Point(4.6,7.8);
        Point punkt2 = new Point(6.2,6.8);


        System.out.println(punkt1.distance(punkt2));
        System.out.printf("%n");
//ZADANIE 3

        Book a1 = new Book();
        Book b2 = new Book("ABC","DEF");
        Book c3 = new Book("HIJ","KLM",2137);
        System.out.printf("%n");
//ZADANIE 4

        Car car1 = new Car();
        Car car2 = new Car("Toyota","Corolla");
        Car car3 = new Car("BMW","E46",2000,350000);
        car1.showInformation();
        System.out.printf("%n");
        car2.showInformation();
        System.out.printf("%n");
        car3.showInformation();
        car3.drive(1);
        car3.showInformation();
        System.out.printf("%n");

//ZADANIE 5

        Car original = new Car("Audi","A3",2000,289000);
        Car copy = new Car(original);

        original.showInformation();
        System.out.printf("%n");
        copy.showInformation();
        System.out.printf("%n");
        copy.drive(500);
        original.showInformation();
        System.out.printf("%n");
        copy.showInformation();
        System.out.printf("%n");

        //Obiekt original nie został zmieniony, ponieważ zmienne original i copy wskazują na dwa różne adresy w pamięci.



//ZADANIE 6


        Person first = new Person("Anna");
        Person second = first;

        second.name = "Maria";
        first.introduceYourself();
        System.out.printf("%n");
        second.introduceYourself();
        System.out.printf("%n");
        //1.Powstał jeden obiekt. 2.Istnieją dwie referencje. 3.Bo nie tworzymy nowego obiektu tylko kopiujemy adres w pamięci.

//ZADANIE 7

        Person second2 = new Person(first);
        second2.name = "Anna";
        second2.introduceYourself();
        System.out.printf("%n");

        //W przypadku pierwszym wskazujemy na ten sam adres w pamięci a w drugim na dwa inne

//ZADANIE 8

        Counter c1 = new Counter(1);
        Counter c2 = new Counter(10);
        System.out.println(c1.value);
        System.out.printf("%n");
        System.out.println(c2.value);
        System.out.printf("%n");

        c1.increaseOther(c2);
        System.out.println(c1.value);
        System.out.printf("%n");
        System.out.println(c2.value);
        System.out.printf("%n");

        //Metoda może zmienić stan obiektu utworzonego poza nią, ponieważ w języku Java obiekty są przekazywane przez wartość referencji.

//ZADANIE 9

        Car car = null;
        if (car != null) {
            car.showInformation();
        } else {
            System.out.println("Obiekt 'car' nie został zainicjalizowany.");
        }
        System.out.printf("%n");

//ZADANIE 10

        Box a = new Box(10);
        Box b = a;
        Box c = new Box(a.value);

        b.value = 20;
        c.value = 30;

        System.out.println(a.value);
        System.out.println(b.value);
        System.out.println(c.value);

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.printf("%n");
        /*a-------> value=20
         b-------> value=20
         c-------> value 30*/

//ZADANIE 11
        //Program nie kompiluje się z powodu błędnej deklaracji konstruktora.

        Product product = new Product("Monitor", 1200);
        product.show();

        //Słowo kluczowe this jest referencją wskazującą na aktualną instancję klasy, w której kod jest wykonywany.


//ZADANIE 12

        Film film = new Film("Incepcja", 148, "Sci-Fi");
        SalaKinowa sala = new SalaKinowa(1, 50);
        Seans seans = new Seans(film, sala, "18:30");

        Bilet bilet = new Bilet(seans, 3, 12, "Normalny");

        bilet.udzielDostepuNaSale();
        System.out.println("Zostało wolnych miejsc: " + seans.pobierzIloscDostepnychMiejsc());

    }


}