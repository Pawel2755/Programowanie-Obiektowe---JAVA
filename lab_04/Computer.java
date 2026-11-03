public class Computer  extends  Device{
    private int ramGb;

    public Computer(String manufacturer, int ramGb) {
        super(manufacturer);
        this.ramGb = ramGb;
    }

    public int getRamGb() {
        return ramGb;
    }

    public void runDiagnostics() {
        System.out.println("Uruchamianie diagnostyki Pamięć RAM: " + ramGb + " GB.");
    }
}
