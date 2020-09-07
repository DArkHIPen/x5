import java.util.Scanner;

public class ExFour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer, please: ");

        String numS = scanner.nextLine();

        int num = Integer.parseInt(numS);


        if(num > 0){
            num ++;
            numOut(num);
        }

        else if(num < 0){
            num += -2;
            numOut(num);
        }

        else {
            num = 10;
            numOut(num);
        }


    }

    public static void numOut(int n){
        System.out.println("Your final number is: " + n);
    }


}
