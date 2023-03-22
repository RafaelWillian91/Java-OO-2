package pet;

public class Main {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.eat(10);
        d1.eat(14);
        d1.getColor();
        System.out.println("Cachorro comeu " + d1.getAmount());

    }
}
