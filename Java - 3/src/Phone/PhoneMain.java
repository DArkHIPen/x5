package Phone;

import java.util.Scanner;

public class PhoneMain {
    public static void main(String[] args) {

        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        Scanner scanner = new Scanner(System.in);


        phone1.model = "Samsung";
        phone1.number = "9034567834";
        phone1.weight = 72;

        phone2.model = "Iphone";
        phone2.number = "9034512311";
        phone2.weight = 105;

        phone3.model = "Nokia";
        phone3.number = "9034654444";
        phone3.weight = 34;

        showPhone(phone1.model, phone1.number, phone1.weight);
        showPhone(phone2.model, phone2.number, phone2.weight);
        showPhone(phone3.model, phone3.number, phone3.weight);

        phone1.getNumber();
        phone1.receiveCall("Василий");
        phone2.getNumber();
        phone2.receiveCall("Петя");
        phone3.getNumber();
        phone3.receiveCall("Жаннета");

        Phone phone4 = new Phone("79032459844","DP", 55);
        showPhone(phone4.model, phone4.number, phone4.weight);

        Phone phone5 = new Phone("79032459844","DP");
        showPhone(phone5.model, phone5.number, phone5.weight);

        phone5.receiveCall("Женя", "911");

        phone1.sendMessage(scanner.nextLine());

    }

    public static void showPhone(String m, String n, int w){
        System.out.println("\nБренд телефона: " + m +
                            "\nНомер телефона: " + n +
                            "\nВес телефона: " + w );
    }
}
