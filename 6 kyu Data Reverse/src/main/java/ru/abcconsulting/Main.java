package main.java.ru.abcconsulting;

public class Main {

    public static void main(String[] args) {
        int[] data = new int[] {1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0};
        Kata.printArray(data);
        Kata.printArray(Kata.DataReverse(data));
    }
}
