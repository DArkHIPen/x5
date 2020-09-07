import java.util.Scanner;

public class ExFive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers using Enter, please: ");

        String oneS = scanner.nextLine();

        String twoS = scanner.nextLine();

        String threeS = scanner.nextLine();


        int one = Integer.parseInt(oneS);

        int two = Integer.parseInt(twoS);

        int three = Integer.parseInt(threeS);

        System.out.println("Number's is " + one + ", " + two + ", " + three + ".");

        int min = one;

        if(min > two){
            min = two;
        }
        if (min > three){
            min = three;
        }

        numOut(min);

    }

    public static void numOut(int n){
        System.out.println("Your minimum number is: " + n);
    }

}
