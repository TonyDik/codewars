package main.java.ru.abcconsulting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Kata {

    public static int[] DataReverse(int[] data) {

        List<String> strings = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        if (data.length % 8 == 0) {

            for (int i = 1; i <= data.length; i++) {
                list.add(data[i - 1]);

                if (i % 8 == 0) {
                    String string = list.stream().map(Object::toString).collect(Collectors.joining(","));
                    strings.add(string);
                    list.clear();
                }
            }
            Collections.reverse(strings);
        }

        return Arrays
                .stream(String.join(",", strings).split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
    }


    public static void printArray(int[] array) {
        System.out.print(" ");
        for (int el: array) {
            System.out.printf("%d ", el);
        }
        System.out.print("\n");
    }

}
