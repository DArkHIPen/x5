import java.util.Scanner;

public class ExSix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число, пожалуйста: ");

        String numS = scanner.nextLine();
        int num = Integer.parseInt(numS);


        if(num > 0){
            System.out.println("Положительное " + isEven(num) +  " число");
        }

        else if (num < 0){
            System.out.println("Отрицательное " + isEven(num) +  " число");
        }

        else {
            System.out.println("Нулевое число.");
        }

    }

    public static String isEven (int n){
        if(n % 2 == 0){
            return "чётное";
        }
        else {
            return "нечётное";
        }
    }

}


