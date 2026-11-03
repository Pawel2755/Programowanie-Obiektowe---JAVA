public class Truck extends Vehicle1{
    private double payloadCapacity;

    public Truck(String brand, int maxSpeed, double payloadCapacity) {
        super(brand, maxSpeed);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Maksymalna ładowność: " + payloadCapacity );
    }
}
