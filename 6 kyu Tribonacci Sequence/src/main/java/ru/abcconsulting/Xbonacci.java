package main.java.ru.abcconsulting;

import java.util.ArrayList;
import java.util.List;

public class Xbonacci {

    public double[] tribonacci(double[] s, int n) {
        List<Double> doubleList = new ArrayList<>();


        // signature always have 3 numbers
        // if numbers in signature != 3 then return empty array
        if (s.length != 3) {
            return new double[0];
        }

        // n always is non-negative
        // if n is negative return empty array
        if (n < 0) {
            return new double[0];
        }

        for (double digit: s) { doubleList.add(digit); }


        for (int i = 0; i < n; i++) {

            double sum = doubleList.get(i) + doubleList.get(i + 1) + doubleList.get(i + 2);
            doubleList.add(sum);

        }

        return doubleList
                .stream()
                .limit(n)
                .mapToDouble(value -> value)
                .toArray();
    }

    void printArray(double[] array) {
        List<Double> doubles = new ArrayList<>();
        for (double digit: array) { doubles.add(digit); }
        System.out.print("[ ");
        doubles.forEach(aDouble -> System.out.printf("%.2f ", aDouble));
        System.out.print("]");
    }
}