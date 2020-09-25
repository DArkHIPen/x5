public class Lorry extends Car {
    private int carryWeight;

    public Lorry(String modelName, String modelClass, double weight, Engine engine, int carryWeight) {
        super(modelName, modelClass, weight, engine);
        this.carryWeight = carryWeight;
    }

    public int getLoadCarrying() {
        return carryWeight;
    }

    @Override
    public String start() {
        return "Грузовик поехал";
    }

    @Override
    public String stop() {
        return "Грузовик остановился";
    }

    @Override
    public String printInfo() {
        return "Модель: " + getModelName() +
                "\n Класс: " + getModelClass() +
                "\n Вес: " + getWeight() +
                "\n Двигатель: " + engine.EngineOut() +
                "\n Грузоподьемность: " + carryWeight;
    }

}

