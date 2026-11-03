public class Device {
    private String manufacturer;

    public Device(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void powerOn() {
        System.out.println("Urządzenie marki " + manufacturer + " zostało włączone.");
    }
}
