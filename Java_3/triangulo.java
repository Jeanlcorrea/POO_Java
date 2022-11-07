public class Triangulo extends Area {
    public Triangulo (double base, double altura) {
        super (base, altura);
    }

    public double CalculaArea() {
        double base = super.RetornaV1();
        double altura = super.RetornaV2

        return (base *altura) / 2;
    }
}