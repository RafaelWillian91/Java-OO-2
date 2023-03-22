package exercicioLoggin;

public class mainLoggin implements Loggin {

    public static final String USERNAME  = "admin";
    public final static String PASSWORD = "admin";

    private String username;
    private String password;
    public mainLoggin(){
        this(USERNAME, PASSWORD);
    }
    public mainLoggin(String usarname, String password){
        this.username=  usarname;
        this.password = password;
    }

    @Override
    public boolean login(String usarname, String passwordp) {
        return (usarname.equals(username) && passwordp.equals(password));

    }



}
