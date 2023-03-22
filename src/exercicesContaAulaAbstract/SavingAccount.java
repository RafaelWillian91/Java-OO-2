package exercicesContaAulaAbstract;

public class SavingAccount extends Account{


    public SavingAccount(double balance){
        super(100);
    }

    @Override
    public double rate() {
        return 0.05;
    }
}
