package Phone;

import java.util.Arrays;

public class Phone {

    private String number;
    private String model;
    private int weight;

    public Phone() {
        number = "9123456789";
        model = "Asus";
        weight = 73;
    }

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public void getInfoPhone() {
        getModel();
        getNumber();
        getWeight();
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void getNumber() {
        System.out.println("Номер телефона: " + number);
    }

    public void getModel() {
        System.out.println("Модель телефона: " + model);
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void getWeight() {
        System.out.println("Вес телефона: " + weight);
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " с номера " + number);
    }

    public void sendMessage(String... number) {
        System.out.println(Arrays.toString(number));
    }

}


