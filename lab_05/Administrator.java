public class Administrator extends Employee{
    public Administrator(String name) {
        super(name);
    }

    @Override
    public double calculateSalary() {
        return 5000;
    }
}
