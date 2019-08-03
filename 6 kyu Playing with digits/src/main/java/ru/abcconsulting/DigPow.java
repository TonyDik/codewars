package main.java.ru.abcconsulting;

public class DigPow {

    public static long digPow(int n, int p) {
        long sumOfDigitsInPower = DigPow.sumOfDigitsInPower(n, p);
        long k = 0;

        if (n != 0) {
            k = sumOfDigitsInPower / n;
        }

        if (k * n == sumOfDigitsInPower) {
            return k;
        } else {
            return -1;
        }

    }

    public static long sumOfDigitsInPower(int number, int power) {
        long sum = 0;
        String numberString = String.valueOf(number);

        for (int i = 0; i < numberString.length(); i++) {
            int digit = Character.getNumericValue(numberString.charAt(i));
            sum += Math.pow(digit, power + i);
        }

        return sum;
    }

}