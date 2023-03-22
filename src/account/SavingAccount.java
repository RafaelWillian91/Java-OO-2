package account;

public class SavingAccount extends Account{



    private double rate;

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance * rate;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Rate: " + rate);
    }

    public double getRate() {
        return rate;
    }
}
