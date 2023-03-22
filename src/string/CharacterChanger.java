package string;

public interface CharacterChanger {

    public static final String a = "d";


    default String upper(String s){
        return getChar() + s.substring(3);
    }

    private char getChar(){

        return '*';
    }

    static String st(){
        return "Rafael";
    }


}
