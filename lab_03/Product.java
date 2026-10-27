public class Product {
    private String name;
    private double price;
    private static int numberOfProducts = 0;
    public static final int MAX_PRODUCTS = 4;

    public Product(String name, double price) {
        if(numberOfProducts >= MAX_PRODUCTS){
            System.out.println("Przekroczono liczbe produktow");
        }

        this.name = name;
        this.price = price;
        numberOfProducts++;
    }

    public static int getNumberOfProducts() {
        return numberOfProducts;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}