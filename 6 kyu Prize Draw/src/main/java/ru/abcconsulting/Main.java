package main.java.ru.abcconsulting;

public class Main {

    public static void main(String[]args){
        String st = "Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin";
        Integer[] we = new Integer[] {4, 2, 1, 4, 3, 1, 2};
        int n  = 4;
        System.out.println(Rank.nthRank(st, we, n));

        st = "Elijah,Chloe,Elizabeth,Matthew,Natalie,Jayden";
        we = new Integer[] {1, 3, 5, 5, 3, 6};
        n = 2;
        System.out.println(Rank.nthRank(st, we, n));

    }
}
