package main.java.ru.abcconsulting;

import java.util.*;
import java.util.stream.Collectors;


/**
 Solution of the smart guy

 public class Interval {

     public static int sumIntervals(int[][] intervals) {
         return intervals == null ? 0 : (int) Arrays.stream(intervals)
                                                .flatMapToInt(interval -> IntStream.range(interval[0], interval[1]))
                                                .distinct()
                                                .count();
     }
 }

 */
public class Interval {

    public static int sumIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0)
            return 0;

        List<IntInterval> intIntervals = Arrays
                .stream(intervals)
                .map(interval -> new IntInterval(interval[0], interval[1]))
                .filter(intInterval -> !intInterval.getLength().equals(0))
                .sorted(Comparator.comparing(IntInterval::getStart))
                .collect(Collectors.toList());

        if (intIntervals.size() == 0)
            return 0;

        LinkedList<IntInterval> linkedList = new LinkedList<>(intIntervals);

        for (int j = 0; j < intIntervals.size(); j ++) {
            for (int i = 0; i < linkedList.size()-1; i++) {
                IntInterval first = linkedList.get(i);
                IntInterval second = linkedList.get(i + 1);
                List<Integer> digits = first.getDigits();

                if (digits.contains(second.getStart())) {
                    Integer maxEnd = first.getEnd() > second.getEnd() ? first.getEnd() : second.getEnd();
                    IntInterval newInterval = new IntInterval(first.getStart(), maxEnd);
                    linkedList.remove(i + 1);
                    linkedList.remove(i);
                    linkedList.add(i, newInterval);
                }
            }
        }
        return linkedList.stream().mapToInt(IntInterval::getLength).sum();
    }
}

class IntInterval {

    private Integer start;
    private Integer end;

    public IntInterval(Integer start, Integer end) {
        this.start = start;
        this.end = end;
    }

    public Integer getLength() {
        return end - start;
    }

    public List<Integer> getDigits() {
        List<Integer> digits = new LinkedList<>();

        if(getLength() == 0)
            return Collections.emptyList();

        for (int i = start; i <= end; i++) {
            digits.add(i);
        }
        return digits;
    }

    public Integer getStart() {
        return start;
    }

    public Integer getEnd() {
        return end;
    }

}


