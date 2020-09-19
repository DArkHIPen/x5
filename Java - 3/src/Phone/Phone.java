package Phone;

import java.util.Arrays;

public class Phone {

    public String number;
    public String model;
    public int weight;

    public void getNumber(){
        System.out.println("\nНомер телефона: " + number);
    }
    public void receiveCall (String name){
        System.out.println("Звонит " + name);
    }
    public void receiveCall (String name, String number){
        System.out.println("Звонит " + name + " с номера " + number);
    }
    public void sendMessage(String... number){
        System.out.println(Arrays.toString(number));
    }

    public Phone(String number, String model, int weight){
        this(number, model);
        this.weight = weight;
    }
    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }

    Phone(){}

}


