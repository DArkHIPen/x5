public class Main {
    public static void main(String[] args) {

        Shape[] shape = new Shape[3];
        shape[0] = new Triangle(3,1);
        shape[1] = new Circle(3);
        shape[2] = new Rectangle(3,5);

        for (Shape sh: shape){
            System.out.println("Площадь фигуры: "+sh.square());
        }

    }
}
