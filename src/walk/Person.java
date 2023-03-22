package walk;

public class Person implements walkable, Jumpable{

    private int stop;
    private int travelledDistance;
    @Override
    public void walk() {
        stop++;
        travelledDistance += 10;
    }

    @Override
    public void stop() {
        stop = 0;
    }


    @Override
    public void jump() {
        walk();
        walk();
    }
}
