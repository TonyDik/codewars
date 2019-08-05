package main.java.ru.abcconsulting;

public class Solution {

    public static String camelCase(String str) {
        StringBuilder sb = new StringBuilder();

        for (String word: str.split(" ")) {
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (i == 0) {
                    ch = Character.toUpperCase(ch);
                }
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
