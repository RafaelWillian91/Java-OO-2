package pet2;

public class Dog implements Pet{
    @Override
    public void alimentar() {
        System.out.println("Dog Comeu!");
    }

    public void run(){
        System.out.println("Dog Correu");
    }


}
