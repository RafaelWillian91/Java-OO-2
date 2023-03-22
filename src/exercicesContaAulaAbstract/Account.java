package exercicesContaAulaAbstract;

public abstract class Account {


    private double balance;

    public Account(double balance){
        this.balance = balance;
    }
    public void updateBalance(){
        this.balance += balance + rate();
    }

    public abstract double rate();


    public double getBalance() {
        return balance;
    }
}
