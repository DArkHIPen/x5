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

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers using Enter, please: ");
        String oneS = scanner.nextLine();
        int one = Integer.parseInt(oneS);
        String twoS = scanner.nextLine();
        int two = Integer.parseInt(twoS);
        String threeS = scanner.nextLine();
        int three = Integer.parseInt(threeS);

        int min = one;
        if (min > two) {
            min = two;
        }
        if (min > three) {
            min = three;
        }

        numOut(min);

    }

    public static void numOut(int n) {
        System.out.println("Your minimum number is: " + n);
    }
    */
    }
}
