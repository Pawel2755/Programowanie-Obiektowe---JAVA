public class Vehicle1 {
    private String brand;
    private int maxSpeed;

    public Vehicle1(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void startEngine() {
        System.out.println("Silnik został uruchomiony.");
    }

    public void displayInfo() {
        System.out.println("Pojazd marki: " + brand + ", prędkość maksymalna: " + maxSpeed + " km/h");
    }
}
