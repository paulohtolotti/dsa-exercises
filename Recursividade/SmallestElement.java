package Recursividade;

import java.util.Arrays;
import java.util.List;

public class SmallestElement {
    public static double smallestElement(List<Double> list) {

        if(list.size() == 1) return list.get(0);

        return tailSmallestElement(list, list.get(0));
    }

    public static double tailSmallestElement(List<Double> list, double smallest) {

        if(list.size() == 0) return smallest;

        double head = list.get(0);

        if(head < smallest) smallest = head;

        List<Double> tail = list.subList(1, list.size());

        return tailSmallestElement(tail, smallest);
    }

    public static void main(String[] args) {

        List<Double> a =  Arrays.asList(4.0, 5.0, 3.0);
        List<Double> b = Arrays.asList(110.13, -45.98, -130.32, 11.34);

        System.out.println(smallestElement(a));
        System.out.println(smallestElement(b));

    }
}
