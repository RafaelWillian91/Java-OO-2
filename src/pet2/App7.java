package pet2;

public class App7 {

    public static void main(String[] args) {

        Pet p = new Dog();
        p.alimentar();

        feedPet(p);

        Pet c = new Cat();
        feedPet(c);

        feedPet(new Fish());

        System.out.println("----------------------------");

        Dog d2 = (Dog) p;

        d2.run();


        if (p instanceof Dog d){
            d.run();
        }else{
            System.out.println("Não é");
        }




    }

    private static void feedPet(Pet pet){
        pet.alimentar();
    }

}
