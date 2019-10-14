package ru.abcconsulting;

import main.java.ru.abcconsulting.Dictionary;

public class Main {

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary(new String[]{"cherry", "pineapple", "melon", "strawberry", "raspberry"});
        System.out.println(dictionary.findMostSimilar("berry"));
        dictionary = new Dictionary(new String[]{"javascript", "java", "ruby", "php", "python", "coffeescript"});
        System.out.println(dictionary.findMostSimilar("heaven"));
    }
}
