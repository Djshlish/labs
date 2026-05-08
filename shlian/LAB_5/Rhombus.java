package LAB_5;

public class Rhombus {
    private double d1;
    private double d2;

    public Rhombus(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    public double calculateArea() {
        return (d1 * d2) / 2.0;
    }
}