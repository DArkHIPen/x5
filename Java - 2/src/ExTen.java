public class ExTen {
    public static void main(String[] args) {

        int[] numbers = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        int[] numberNew = new int[numbers.length];
        int index = 0;

        for (int number : numbers) {
            if (number != 0) {
                numberNew[index] = number;
                index++;
            }
        }

        for (int i : numberNew) {
            System.out.print(i + " ");
        }
    }
}

