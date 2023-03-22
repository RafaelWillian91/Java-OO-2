package string;

public class Main {

    public static void main(String[] args) {

        StringManipulatorImpl st1 = new StringManipulatorImpl();

        System.out.println(st1.join("JO", "Si"));

        System.out.println(st1.takeFirst("Java", 2));

        System.out.println(st1.upper("rafael"));

        String d = CharacterChanger.a;
        System.out.println(d);
    }
}





