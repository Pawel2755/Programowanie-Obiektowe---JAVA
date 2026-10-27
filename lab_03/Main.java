import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//ZADANIE 2
        System.out.println("ZADANIE 2");
        Person osoba = new Person("Adam",4,"kocham@olsztyn.pl");
        System.out.printf("%n");


//ZADANIE 3

        System.out.println("ZADANIE 3");
        BankAccount konto = new BankAccount();
        System.out.println(konto.getOwner());
        System.out.println(konto.getBalance());

//ZADANIE 4

        System.out.println("ZADANIE 4");
        int[]points ={10,20,30};;
        ExamResults wyniki = new ExamResults(points);
        System.out.println(Arrays.toString(wyniki.getPoints()));
        System.out.printf("%n");
        points[0] = 0;
        System.out.println(Arrays.toString(wyniki.getPoints()));
        System.out.printf("%n");

//ZADANIE 5

        System.out.println("ZADANIE 5");
        Product produkt1 = new Product("Banan",5.99);
        Product produkt2 = new Product("Banan",5.99);
        Product produkt3 = new Product("Banan",5.99);


        System.out.println(Product.getNumberOfProducts());
        System.out.printf("%n");

//ZADANIE 6

        System.out.println("ZADANIE 6");
        Product produkt4 = new Product("Banan",5.99);
        Product produkt5 = new Product("Banan",5.99);
        System.out.println(Product.getNumberOfProducts());
        System.out.printf("%n");
        /*1.Pole dotyczy całej klasy a nie pojedynczego egzemplarza.
        2.Słowo final tworzy ze zmiennej stałą.
        3.Zmienna numberOfProducts jest licznikiem i jej wartość stale się zmienia.
        */

//ZADANIE 7

        System.out.println("ZADANIE 7");
        System.out.println("Liczba operacji: "+StaticCalculator.getNumberOfOperations());
        double sum = StaticCalculator.add(22.4,65.2);
        System.out.println("Wynik: "+sum);
        double odj = StaticCalculator.subtract(6.67,7.69);
        System.out.println("Wynik: "+odj);
        double mno = StaticCalculator.multiply(8.43,3.65);
        System.out.println("Wynik: "+mno);
        System.out.println("Liczba operacji: "+StaticCalculator.getNumberOfOperations());
        System.out.printf("%n");


//ZADANIE 8

        System.out.println("ZADANIE 8");
        System.out.println("int + int: " + StaticCalculator.add(6, 7));
        System.out.println("int + int + int: " + StaticCalculator.add(6, 9, 3));
        System.out.println("double + double: " + StaticCalculator.add(3.7, 1.67));

        System.out.println("Liczba operacji: " + StaticCalculator.getNumberOfOperations());
        System.out.printf("%n");

//ZADANIE 9

        System.out.println("ZADANIE 9");
        InitializationDemo obj1 = new InitializationDemo();
        System.out.printf("%n");
        InitializationDemo obj2 = new InitializationDemo();
        System.out.printf("%n");

//ZADANIE 10

        /*
        * 1.Instancyjny  - Imie studenta jest unikalne dla kazdego.
        * 2.Statyczny - Jest to liczba wszystkich studentow.
        * 3.Statyczny - Liczba PI jest stałą matematyczna.
        * 4.Instancyjny - Saldo konta ciągle się zmienia.
        * 5.Statyczny - Metoda pomocnicza wykonuje obliczenia na podstawie argumentu price.
        * 6.Instancyjny - Przebieg auta jest wartością unikalną dla danego auta.
        * 7.Statyczny - Liczba prób logowania powinna byc stala by zachowac bezpieczenstwo.
        * */

//ZADANIE 11

        System.out.println("ZADANIE 11");
        //1.Metoda statyczna showUser próbuje uzyskać bezpośredni dostęp do pól instancji login oraz password.
        //2.Pole age jest statyczne, wiek jest cechą unikalną dla każdego użytkownika.
        //Brak hermetyzacji.
        //Brak walidacji danych, konstruktor przyjmuje dowolną wartość wiek.
        //3.Pola login, password, age powinny być instancyjne.

        User user1 = new User("jan_kowalski", "migdały334", 67);
        User user2 = new User("anna_nowak", "masło6767", 69);
        user1.showUser();
        user2.showUser();
        System.out.printf("%n");


//ZADANIE 12

        System.out.println("ZADANIE 12");
        Course k1 = new Course("ABC",30);
        Course k2 = new Course("ASD");
        Student s1 = new Student("Adam","43523");
        System.out.println(Course.getNumberOfCreatedCourses());
        System.out.println(s1.getName());

    }
}