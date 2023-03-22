package account;

public class Account {

    public Account(){

    }


    private String owner;
    private String number;
    protected double balance;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void print(){
        System.out.println(
                            "Nome: " + owner+  "\n" +
                            "Number: " + number+ "\n" +
                            "Balance: " + balance);

    }



}



class teste{


    public static void main(String[] args) {



        for(int a = 0; a < 100; a++){
            System.out.println(a);

            if(a == 5){
                System.out.println("ALESSANDRA");
            }


        }



    }






}


