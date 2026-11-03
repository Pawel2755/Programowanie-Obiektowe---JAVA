public class Manager extends Employee{
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }
    @Override
    public void showInformation() {

        super.showInformation();
        System.out.println("Dział: " + department);
    }
}
