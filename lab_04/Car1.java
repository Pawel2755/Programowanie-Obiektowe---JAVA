public class Car1 extends Vehicle1{
    private int doorsCount;

    public Car1(String brand, int maxSpeed, int doorsCount) {
        super(brand, maxSpeed);
        this.doorsCount = doorsCount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Liczba drzwi: " + doorsCount);
    }

    @Override
    public String toString() {
        return "Auto:" + getBrand() + ", predkoscMax:" + getMaxSpeed() + ", liczba drzwi:" + doorsCount ;
    }
}
