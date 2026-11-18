package Zad3;

public class Salesperson extends Employee{
    private double sales;
    private double commision;

    public Salesperson(String name, double baseSalary,double sales,double commision){
        super(name,baseSalary);
        this.sales = sales;
        this.commision = commision;
    }
    @Override
    public double calculateSalary(){
        return getBaseSalary() + (sales*commision);
    }
}
