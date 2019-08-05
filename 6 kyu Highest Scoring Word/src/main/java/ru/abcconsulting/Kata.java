package main.java.ru.abcconsulting;

public class Kata {

    public static String high(String s) {

        int highest = 0;
        String res = "";

        for (String word: s.split(" ")) {
            int wordSum = 0;
            for (char ch: word.toCharArray()) {
                wordSum += (int)ch - 96;
            }

            if (wordSum > highest) {
                highest = wordSum;
                res = word;
            }
        }
        return res;
    }

}