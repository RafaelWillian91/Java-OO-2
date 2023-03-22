package record;

public class App11 {

    public static void main(String[] args) {

        Person p1 = new Person("Jose", "Silva", 30);
        System.out.println(p1);
         Person p2 = new Person("Jose", "Silva", 30);

        System.out.println(p2);

        System.out.println((p1.equals(p2)) ? "è igual" : "Não é igual");
    }
}


class JavaRecordTop{

    public static void main(String[] args) {

        PersonRecord p1 = new PersonRecord("Rafael", "Willian", 31);
        System.out.println(p1);
        System.out.println("Gerado por record: " + p1.firstName());

        PersonRecord p3 = new PersonRecord("fasfa", "dasdas", 99);
        PersonRecord p4 = p3.getNome();

    }


}