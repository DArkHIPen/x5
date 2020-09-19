import java.util.Scanner;

public class ExFive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers using Enter, please: ");
        int min = scanner.nextInt();
        for (int i = 0; i < 2; i++) {
            int in = scanner.nextInt();
            if (in < min) {
                min = in;
            }
        }
        System.out.println("Your minimum number is: " + min);

    }
}
