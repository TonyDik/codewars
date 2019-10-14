package ru.abcconsulting;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

import static java.util.Comparator.comparingInt;
import static java.util.Map.Entry.comparingByKey;
import static java.util.Map.Entry.comparingByValue;

public class Dictionary {

    private final String[] words;

    public Dictionary(String[] words) {
        this.words = words;
    }

    public String findMostSimilar(String to) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        if (words == null || words.length == 0)
            return to;
        for (String word : words) {
            int temp1 = StringUtils.getLevenshteinDistance(to, word);
//            int temp = getLevenshteinDistance(to.toCharArray(), to.length(), word.toCharArray(), word.length());

            map.put(word, temp1);
        }
        return map
                .entrySet()
                .stream()
                .sorted(comparingByValue())
                .sorted(comparingByKey())
                .min(comparingInt(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .get();
    }

    /**
     * recursive algorithm
     */
    public int getLevenshteinDistance(char[] first,int first_len, char[] second, int second_len) {
        int constant;

        if (first == null || second == null) {
            throw new IllegalArgumentException("Strings must not be null");
        }

        if (first_len == 0) {
            return second_len;
        } else if (second_len == 0) {
            return first_len;
        }

        if (first[first_len - 1] == second[second_len - 1]) {
            constant = 0;
        } else {
            constant = 1;
        }

        return Math.min(
                Math.min(
                        getLevenshteinDistance(first, first_len - 1, second, second_len) + 1,
                        getLevenshteinDistance(first, first_len, second, second_len - 1)) + 1,
                getLevenshteinDistance(first, first_len - 1, second, second_len - 1) + constant);


    }
}