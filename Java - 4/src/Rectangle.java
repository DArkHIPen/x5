public class Rectangle implements Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double square() {
        return height * width;
    }
}
