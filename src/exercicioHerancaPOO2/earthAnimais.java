package exercicioHerancaPOO2;

public class earthAnimais extends Animais{


    protected int andar = 0;


    public void falar(){
        System.out.println("Falou");
    }

    public void andar(){
        andar++;
    }

}
