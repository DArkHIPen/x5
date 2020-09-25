public class Circle implements Shape {
    final private double P = 3.14;
    private double r;

    public Circle(double r){
        this.r = r;
    }

    public double square() {
        return P * (r*r);
    }
}
