public class Main {
    public static void main(String[] args) {

        Engine engineSportCar = new Engine("Nissan", "VG30DET", 255.0);
        Engine lorryEngine = new Engine("Nissan", "ZD30", 150.0);

        Car lorry = new Lorry("Nissan Cabstar", "Грузовик", 2515, lorryEngine, 1656);

        Car sportCar = new SportCar("Nissan GT-R", "Sport car", 1740, engineSportCar, 280);


        lorry.start();
        lorry.turnLeft();
        sportCar.turnRight();
        sportCar.stop();

        sportCar.printInfo();
        System.out.println(lorry.printInfo());
        System.out.println(sportCar.printInfo());

    }
}
