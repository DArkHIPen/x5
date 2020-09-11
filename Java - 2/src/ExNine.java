public class ExNine {
    public static void main(String[] args) {

        int[] numbers = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        int[] numbersBack = new int[numbers.length];
        int a = 0;

        for (int i = numbers.length - 1; i >= 0; i--) {
            numbersBack[a] = numbers[i];
            System.out.print(numbersBack[a] + " ");
            a++;
        }

    }

}
