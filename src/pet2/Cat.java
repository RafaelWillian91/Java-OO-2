package pet2;

import pet2.Pet;

public class Cat implements Pet {

    @Override
    public void alimentar() {
        System.out.println("Cat Comeu!");
    }

}
