public class Tester extends Employee{
    public Tester(String name) {
        super(name);
    }
    @Override
    public double calculateSalary() {
        return 1000;
    }
}
