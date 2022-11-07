public class Retangulo extends Area {
    
    public Retangulo (double l1, double l2) {
        super(l1, l2);
    }

    public double CalculaArea() {
        double lado1 = super.RetornaV1();
        double lado2 = super.RetornaV2();

        return (lado1 * lado2);
    }
}