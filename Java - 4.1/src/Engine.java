public class Engine {
    private String manufacturer;
    private double power;

    public Engine(String manufacturer, String model, double power) {
        this.manufacturer = manufacturer;
        this.power = power;
    }

    public String EngineOut (){
        return "\n\t Производитель :" + manufacturer +
        "\n\t Мощность: " + power;
    }

}
