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

        /*
        String moscow = "905";
        String moscowC = "Москва.";
        double m = 4.15;
        String rostov = "194";
        String rostovC = "Ростов.";
        double r = 1.98;
        String krasnodar = "491";
        String krC = "Краснодар.";
        double kr = 2.69;
        String kirov = "800";
        String kiC = "Киров.";
        double ki = 5.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите код города, пожалуйста: ");
        String code = scanner.nextLine();

        if (code.equals(moscow)) {
            System.out.println(outPrice(moscowC, m));
        } else if (code.equals(rostov)) {
            System.out.println(outPrice(rostovC, r));
        } else if (code.equals(krasnodar)) {
            System.out.println(outPrice(krC, kr));
        } else if (code.equals(kirov)) {
            System.out.println(outPrice(kiC, ki));
        } else {
            System.out.println("Код города в базе отсутствует.");
        }

    }
*/
    }

    public static String outPrice(String c, double a) {
        a *= 10;
        return c + " Стоимость разговора: " + a;
    }


}
