package javaExceptions;

public class Account2 {

    private String number;
    private int balance;

    public Account2(String number){
        this.number = number;
    }

    public int withdraw(int value){

        if(value < 0){
            return 3;
        }
        if((balance - value) < 0 ) {
            return 2;
        }
        return 1;
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
