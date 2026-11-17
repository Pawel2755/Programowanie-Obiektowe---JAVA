public class Manager extends Employee{
    public Manager(String name) {
        super(name);
    }
    @Override
    public double calculateSalary() {
        return 2000;
    }
}
