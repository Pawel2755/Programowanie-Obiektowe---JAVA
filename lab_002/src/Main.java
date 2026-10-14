public class Main {
    public static void main(String[] args) {
//ZADANIE 1
    Dog pies1 = new Dog("Burek","Kundel",3);
    Dog pies2 = new Dog("Rex", "Owczarek Niemiecki", 5);


    pies1.showInformation();
    pies1.bark();
    pies2.showInformation();
    pies2.bark();

//ZADANIE 2

    Point punkt1 = new Point(4.6,7.8);
    Point punkt2 = new Point(6.2,6.8);


    System.out.println(punkt1.distance(punkt2));
//ZADANIE 3

    Book a = new Book();
    Book b = new Book("ABC","DEF");
    Book c = new Book("HIJ","KLM",2137);

//ZADANIE 4



    }


}
