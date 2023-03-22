package javaExceptions.App;

import javaExceptions.Account2;

public class App2 {

    public static void main(String[] args) {

        Account2 account2 = new Account2("123");
        account2.deposit(1000);
        int rci = account2.withdraw(-1002);

        if(rci == 3){
            System.out.println("Amount is negative");
        }

        if(rci == 2){
            System.out.println("Error not enough");
        }else if (rci == 1){
            System.out.println("Sucess");
            System.out.println(account2);
        }



    }




}
