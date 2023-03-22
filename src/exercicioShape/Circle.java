package exercicioShape;

import exercicioLoggin.Main;

public class Circle implements Shape {
    private final int raio;
    public Circle(int raio){
        this.raio = raio;
    }
    @Override
    public void surfaceArea() {
        System.out.println("A área do Circulo é " + Math.PI * (raio * raio));
    }
}
