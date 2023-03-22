package javaExceptions.App;

import javaExceptions.Account;

public class App1 {

    public static void main(String[] args) {

        Account account1 = new Account("123");
        account1.deposit(1000);
        if(!account1.withdraw(2000)){
            System.out.println("Error not enough");
        }

        System.out.println(account1);

    }




}
