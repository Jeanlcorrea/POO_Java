public abstract class Area {
    private double v1; v2;

    public abstract double CalculaArea();

    public Area (double v1, double v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public double RetornaV1() {
        return this.v1;
    }
    public double RetornaV2() {
        return this.v2;
    }
}