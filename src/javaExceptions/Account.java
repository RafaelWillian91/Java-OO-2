package javaExceptions;

public class Account {

    private String number;
    private int balance;

    public Account (String number){
        this.number = number;
    }

    public boolean withdraw(int value){
        if((balance - value) >= 0) {
            return true;
        }
        return false;
    }

    public void deposit(int value){
        balance += value;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }
}
