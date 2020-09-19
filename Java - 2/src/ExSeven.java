import java.util.Scanner;

public class ExSeven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите код города, пожалуйста: ");
        int codeCity = scanner.nextInt();

        switch (codeCity) {
            case 905 -> System.out.println(outPrice("Москва.", 4.15));
            case 194 -> System.out.println(outPrice("Ростов.", 1.98));
            case 491 -> System.out.println(outPrice("Краснодар.", 2.69));
            case 800 -> System.out.println(outPrice("Киров.", 5.0));
            default -> System.out.println("Кода города нет в системе.");
        }

    }

    public static String outPrice(String c, double a) {
        a *= 10;
        return c + " Стоимость разговора: " + a;
    }


}
