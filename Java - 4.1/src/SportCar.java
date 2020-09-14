public class SportCar extends Car{
        private double maxSpeed;

        public SportCar(String modelName, String modelClass, double weight, Engine engine, double maxSpeed) {
            super(modelName, modelClass, weight, engine);
            this.maxSpeed = maxSpeed;
        }


    @Override
    public String start(){
        return "SportCar поехал";
    }

    @Override
    public String stop(){
        return "SportCar остановился";
    }

    @Override
    public String printInfo() {
        return "Модель: " + modelName +
                "\n Класс: " + modelClass +
                "\n Вес: " + weight +
                "\n Двигатель: " + engine.EngineOut() +
                "\n Максимальная скорость: " + maxSpeed;
    }


}
