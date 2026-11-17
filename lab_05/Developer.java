public class Developer extends Employee{
    public Developer(String name ) {
        super(name);
    }
    @Override
    public double calculateSalary() {
        return 6000;
    }
}
