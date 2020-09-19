import java.util.ArrayList;

public class ExEight {
    public static void main(String[] args) {

        int[] numbers = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        int max = 0;
        int sumPossitive = 0;
        int sumEvenNeg = 0;
        int possitiveNumbers = 0;
        int average = 0;
        int numberAverage = 0;

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number > 0) {
                sumPossitive += number;
            }
            if (number < 0 || number % 2 == 0) {
                sumEvenNeg += number;
            }
            if (number > 0) {
                possitiveNumbers++;
            }
            if (number < 0) {
                numberAverage ++;
                average += number;
            }

        }

        System.out.println("Максимальное значение массива: " + max +
                "\nСумма положительных элементов: " + sumPossitive +
                "\nСумма четных отрицательных элементов: " + sumEvenNeg +
                "\nКоличество  положительных элементов: " + possitiveNumbers +
                "\nCреднее арифметическое отрицательных элементов: " + (average / numberAverage));

    }
}
