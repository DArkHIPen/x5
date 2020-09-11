import java.util.Scanner;

public class ExOne {

    //Ввести целое число в консоли и вывести на экран последнюю цифру введенного числа

    public static void main(String[] args) {

        System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer, please: ");
        String num = scanner.nextLine();

        System.out.println("Your last number is: " + num.substring(num.length() - 1));

    }

}

