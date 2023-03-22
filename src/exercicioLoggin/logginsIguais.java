package exercicioLoggin;

public class logginsIguais implements Loggin{


    @Override
    public boolean login(String usarname, String password) {
        return usarname.equals(password);
    }
}
