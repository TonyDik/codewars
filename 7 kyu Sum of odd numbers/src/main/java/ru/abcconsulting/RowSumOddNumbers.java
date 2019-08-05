package main.java.ru.abcconsulting;


public class RowSumOddNumbers {

    public static int rowSumOddNumbers(int n) {
        int numOfSymbols = 0;
        int sum = 0;

        for (int i = n; i > 0; i--) {
            numOfSymbols += i;
        }

        int[] odd = generateOddNumbers(numOfSymbols);

        for (int i = odd.length - n; i < odd.length; i++) {
            sum += odd[i];
        }

        return sum;
    }

    private static int[] generateOddNumbers(int numOfSymbols) {
        int[] ints = new int[numOfSymbols];
        for (int i = 0; i < numOfSymbols; i++) {
            ints[i] = 2 * i + 1;
        }
        return ints;
    }

}
