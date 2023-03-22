package app;

import account.Account;
import account.SavingAccount;

public class App1 {

    public static void main(String[] args) {

        Account a1 = new Account();
       // a1.setOwner("Rafael");
        a1.setNumber("1000");
        a1.setBalance(300000);
        a1.print();

        SavingAccount a2 = new SavingAccount();
       // a2.setOwner("Joao");
        a2.setNumber("22222");
        a2.setRate(1.2);
        a2.setBalance(10000);
        a2.print();


    }

}
