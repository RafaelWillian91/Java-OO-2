package string;

public interface StringManipulator {

    public static final int a= 10;
    public String join(String s1, String s2);
    public String takeFirst(String s1, int lenght);

    default String upper(String s){
        return s.toUpperCase();
    }

    private void tese(){

    }

}
