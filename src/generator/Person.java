package generator;

public class Person {

    private int id;

    public Person(Generator generator){
        this.id = generator.next();
    }
    public int getId() {
        return id;
    }
}
