package exercicioShape;

public class Square extends Rectangle implements Shape {


    public Square(int base) {
        super(base, base);
    }


    @Override
    public void surfaceArea() {
        System.out.println("A área do Quadrado é " + (this.base * base));
    }
}
