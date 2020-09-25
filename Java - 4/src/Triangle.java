public class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double square() {
        return (base* height)/2;
    }
}
