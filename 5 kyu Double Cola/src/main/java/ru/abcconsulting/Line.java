package main.java.ru.abcconsulting;

public class Line {
    public static String whoIsNext(String[] names, int n) {
        int sumCans = 0;
        int numIteration = 0;
        while (sumCans < n){
            for (String name : names) {
                sumCans += (int) Math.pow(2, numIteration);
                if (sumCans >= n) {
                    return name;
                }
            }
            numIteration++;
        }
        return null;
    }
}