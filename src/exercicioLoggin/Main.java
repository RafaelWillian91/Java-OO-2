package exercicioLoggin;

public class Main {

    public static void main(String[] args) {

        mainLoggin user1 = new mainLoggin();
        boolean a = user1.login("admin", "admin");

        System.out.println(a  ? "Login com Sucesso" : "Login Falhou");

        mainLoggin user3  = new mainLoggin("a", "b");
        System.out.println(user3.login("a", "b"));

        logginsIguais l1 = new  logginsIguais();
        System.out.println(l1.login("as", "as"));

    }

}

