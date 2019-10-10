package main.java.ru.abcconsulting;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[] { "Sheldon", "Leonard", "Penny", "Rajesh", "Howard" };

        System.out.println(Line.whoIsNext(names, 1));
        System.out.println(Line.whoIsNext(names, 17));
        System.out.println(Line.whoIsNext(names, 12));
        System.out.println(Line.whoIsNext(names, 35));
        System.out.println(Line.whoIsNext(names, 124678824));

    }
}
