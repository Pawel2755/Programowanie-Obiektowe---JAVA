package Zad3;

public class Manager extends Employee{
    private int teamSize;
    private double bonus;

    public Manager(String name, double bonus,double baseSalary,int teamSize){
        super(name,baseSalary);
        this.bonus = bonus;
        this.teamSize = teamSize;
    }
    @Override
    public double calculateSalary(){
        return getBaseSalary() + bonus;
    }
}
