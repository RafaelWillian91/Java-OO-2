package exercicioShape;

public interface Shape {

    void surfaceArea();


    default void teste(){
        System.out.println("N");
    }


}
