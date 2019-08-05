package main.java.ru.abcconsulting;

import java.util.List;

public class SmileFaces {

    public static int countSmileys(List<String> arr) {
        int count = 0;
        String[] eyes = {":", ";"};
        String[] noses = {"-", "~"};
        String[] mouth = {")", "D"};


        if (arr.isEmpty()) {
            return 0;
        }

        for (String smile: arr) {

            if (hasFeatures(smile, eyes) && hasFeatures(smile, mouth)) {
                char second = smile.charAt(1);

                if (second == noses[0].charAt(0)
                        || second == noses[1].charAt(0)
                        || second == mouth[0].charAt(0)
                        || second == mouth[1].charAt(0)) {
                    count ++;
                }

            }

        }

        return count;
    }

    private static boolean hasFeatures(String smile, String[] eyes) {
        boolean res = false;
        for (String eye: eyes) {
            if (smile.contains(eye)) {
                res = true;
            }
        }
        return res;
    }
}