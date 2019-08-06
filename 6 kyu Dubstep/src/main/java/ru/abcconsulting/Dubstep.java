package main.java.ru.abcconsulting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dubstep {
    public static String SongDecoder (String song)
    {
        StringBuilder sb = new StringBuilder();
        String space = "WUB";

        for (String string: song.split(space)) {
            sb.append(string);
            sb.append(" ");
        }
        System.out.println(sb);

        String regex = "^" + space;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(song);
        System.out.println(matcher);

        return sb.toString();
    }
}