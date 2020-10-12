public abstract class Car {

    private String modelName;
    private String modelClass;
    private double weight;
    private Engine engine;

    public Car(String modelName, String modelClass, double weight, Engine engine) {
        this.modelName = modelName;
        this.modelClass = modelClass;
        this.weight = weight;
        this.engine = engine;
    }

    public abstract String start();

    public String getModelName() {
        return modelName;
    }

    public String getModelClass() {
        return modelClass;
    }

    public double getWeight() {
        return weight;
    }

    public Engine getEngine() {
        return engine;
    }

    public abstract String stop();

    public abstract String printInfo();

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }


}
