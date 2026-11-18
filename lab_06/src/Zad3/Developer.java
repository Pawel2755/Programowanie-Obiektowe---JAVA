package Zad3;

import com.sun.source.tree.BreakTree;

public class Developer extends Employee{
    private double Bonus;

    public  Developer(String name, double baseSalary,double Bonus){
        super(name,baseSalary);
        this.Bonus = Bonus;
    }
    @Override
    public double calculateSalary(){
        return getBaseSalary() + Bonus;
    }
}
