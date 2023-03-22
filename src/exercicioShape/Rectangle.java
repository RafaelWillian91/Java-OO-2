package exercicioShape;

public class Rectangle implements Shape {

    int base;
    private int altura;
    public Rectangle(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    @Override
    public void surfaceArea() {
        System.out.println("A área do Retângulo é " + (base * altura));
    }
}
