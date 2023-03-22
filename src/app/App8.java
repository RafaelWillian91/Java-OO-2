package app;

import generator.*;

public class App8 {

    public static void main(String[] args) {

        Person p1 = new Person(new RandomGenerator());
        System.out.println(p1.getId());

        Person p2 = new Person(new SequenceGenerator());
        System.out.println(p2.getId());

        Person p3 = new Person(new SequenceGenerator());
        System.out.println(p3.getId());
    }
}
