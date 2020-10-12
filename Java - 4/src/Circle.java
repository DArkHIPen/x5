public class Circle implements Shape {
    public static final double P = 3.14;
    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    public double square() {
        return P * (r * r);
    }
}
