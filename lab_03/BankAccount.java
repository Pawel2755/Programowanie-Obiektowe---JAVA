public class BankAccount {
    private String owner = "Adam Górniak";
    private double balance = 2.7;

    public String getOwner(){
        return owner;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("wartosc nie moze byc ujemna");
        }
        this.balance += amount;
    }
    public void withdraw(double amount){
        if(amount < 0 || balance > amount){
            this.balance -= amount;

        }else {
            System.out.println("kwota musi byc dodatnia i mniejsza od salda");
        }
    }


}