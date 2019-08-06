package main.java.ru.abcconsulting;

public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder sb = new StringBuilder();

        if (numbers.length == 10) {
            sb.append("(");

            for (int i = 0; i < numbers.length; i++) {
                sb.append(numbers[i]);
                if (sb.length() == 4) {
                    sb.append(") ");
                } else if (sb.length() == 9) {
                    sb.append("-");
                }
            }
        }
        return sb.toString();
    }
}