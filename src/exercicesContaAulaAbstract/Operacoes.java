package exercicesContaAulaAbstract;

public class Operacoes {

    public static void main(String[] args) {

        CheckingAccount c1 = new CheckingAccount(0.01);
        System.out.println(c1.getBalance());
        c1.updateBalance();
        System.out.println(c1.getBalance());


        SavingAccount s1 = new SavingAccount(2000);
        System.out.println(s1.getBalance());
        s1.updateBalance();



    }


}
