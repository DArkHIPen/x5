import java.util.Scanner;

public class ExTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three-digit integer, please: ");

        String num = scanner.nextLine();

        int one = Integer.parseInt(num.substring(0,1));

        int two = Integer.parseInt(num.substring(1,2));

        int three = Integer.parseInt(num.substring(2));

        System.out.println("Number's is " + one + ", " + two + ", " + three + ".");

        System.out.println("Sum of numbers: " + (one + two + three));

    }
}
