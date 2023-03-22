package exercicioShape;

public class App9 {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Shape c = new Circle(10);

        Shape r = new Rectangle(10, 20);



        calculator.sumSurfaceArea(new Square(20));
        calculator.sumSurfaceArea(c);
        calculator.sumSurfaceArea(r);

    }

}
