package main.java.ru.abcconsulting;

import java.util.*;
import java.util.stream.Collectors;

public class Rank {

    public static String nthRank(String st, Integer[] we, int n) {
        String[] names = st.split(",");

        if (st.isEmpty())
            return "No participants";

        if (n > names.length)
            return "Not enough participants";

        Map<String, Integer> hashMap = createHashMap(names, we)
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(n)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        return Objects.requireNonNull(hashMap
                .entrySet()
                .stream()
                .skip(hashMap.size() - 1)
                .findFirst()
                .orElse(null))
                .getKey();
    }

    private static int sumOfCharsInString(String string) {
        int sum = 0;
        for (char c: string.toCharArray()) {
            sum += (Character.getNumericValue(c) - 9); // because a = 1
        }
        return sum;
    }

    private static Map<String, Integer> createHashMap(String[] names, Integer[] we) {
        Map<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            Integer weight = we[i];
            Integer winningNumber = (name.length() + sumOfCharsInString(name)) * weight;
            hashMap.put(name, winningNumber);
        }
        return hashMap;
    }
}