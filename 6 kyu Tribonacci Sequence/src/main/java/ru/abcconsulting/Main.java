package main.java.ru.abcconsulting;

public class Main {

    public static void main(String[] args) {
        Xbonacci xbonacci = new Xbonacci();

        double[] res = xbonacci.tribonacci(new double[]{1,1,1}, 10);
        xbonacci.printArray(res);
        System.out.println();

        double[] res1 = xbonacci.tribonacci(new double[]{0,0,1}, 10);
        xbonacci.printArray(res1);
        System.out.println();

        double[] res2 = xbonacci.tribonacci(new double[]{0,1,1}, 10);
        xbonacci.printArray(res2);
        System.out.println();

        double[] res3 = xbonacci.tribonacci(new double[]{0,1}, 10);
        xbonacci.printArray(res3);
        System.out.println();

        double[] res4 = xbonacci.tribonacci(new double[]{0,1,1}, -10);
        xbonacci.printArray(res4);
    }
}
