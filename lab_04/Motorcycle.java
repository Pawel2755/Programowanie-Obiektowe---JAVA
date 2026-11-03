public class Motorcycle extends Vehicle1{
    private boolean loud;

    public Motorcycle(String brand, int maxSpeed, boolean loud) {
        super(brand, maxSpeed);
        this.loud = loud;
    }

    @Override
    public void startEngine() {
        System.out.println("Motocykl " + getBrand() + "zapalił");
    }
}
