public abstract class Car {

        public String modelName;
        public String modelClass;
        public double weight;
        public Engine engine;

        public Car(String modelName, String modelClass, double weight, Engine engine) {
                this.modelName = modelName;
                this.modelClass = modelClass;
                this.weight = weight;
                this.engine = engine;
        }

        public abstract String start();


        public abstract String stop();

        public abstract String printInfo();

        public void turnRight() {
            System.out.println("Поворот направо");
        }

        public void turnLeft() {
            System.out.println("Поворот налево");
        }




}
