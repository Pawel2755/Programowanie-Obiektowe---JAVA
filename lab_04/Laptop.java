public class Laptop extends Computer{
    private int batteryCapacityWh;

    public Laptop(String manufacturer, int ramGb, int batteryCapacityWh) {
        super(manufacturer, ramGb);
        this.batteryCapacityWh = batteryCapacityWh;
    }

    public int getBatteryCapacityWh() {
        return batteryCapacityWh;
    }

    public void checkBatteryStatus() {
        System.out.println("Stan baterii: Pojemność wynosi " + batteryCapacityWh + " Wh.");
    }
}
