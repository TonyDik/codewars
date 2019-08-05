package main.java.ru.abcconsulting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Order {
    public static String order(String words) {
        String[] wordsArr = words.split(" ");
        String[] result = new String[wordsArr.length];


        if (words.isEmpty()) {
            return words;
        }


        for (int i = 0; i < wordsArr.length ; i++) {
            String word = wordsArr[i];
            int num = getNumFromWord(word);
            result[num - 1] = word;
        }

        return String.join(" ", result);

    }

    private static int getNumFromWord(String word) {
        int res = 0;

        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(word);

        if (matcher.find()) {
            String num = word.substring(matcher.start(), matcher.end());
            res = Integer.parseInt(num);
        }

        return res;
    }
}