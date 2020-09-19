import java.util.Scanner;

public class ExTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three-digit integer, please: ");
        String numS = scanner.nextLine();
        int num = Integer.parseInt(numS);

        System.out.println("Sum of numbers: " + sum(num));

    }

    static int sum(int num) {
        int sum = 0;
        do {
            sum += num % 10;
            num /= 10;
        } while (num != 0);
        return sum;
    }
}
