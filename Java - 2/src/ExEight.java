import java.util.ArrayList;

public class ExEight {
    public static void main(String[] args) {

        int[] numbers = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};

        int max = 0;
        int sum = 0;
        int sumEvenNeg = 0;
        int pos = 0;
        int ari = 0;
        ArrayList <Integer> ariM = new ArrayList<>();

        for (int number : numbers) {

            if (number > max) {
                max = number;
            }

            if (number > 0) {
                sum += number;
            }

            if (number < 0 || number % 2 == 0) {
                sumEvenNeg += number;
            }

            if (number > 0) {
                pos++;
            }

            if (number < 0) {
                ariM.add(number);
                ari += number;
            }

        }

        System.out.println("Максимальное значение массива: " + max +
                            "\nСумма положительных элементов: " + sum +
                            "\nСумма четных отрицательных элементов: " + sumEvenNeg +
                            "\nКоличество  положительных элементов: " + pos +
                            "\nCреднее арифметическое отрицательных элементов: " + (ari / ariM.size()));

    }
}
