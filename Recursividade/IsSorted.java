package Recursividade;

import java.util.Arrays;
import java.util.List;

public class IsSorted {
    public static boolean isSorted(List<Double> list) {

        if(list.size() <= 1 ) return true;

        double h = list.get(0);
        double h1 = list.get(1);

        if(h > h1) return false;

        List<Double> tail = list.subList(1, list.size());

        return isSorted(tail);
        
    }

    public static void main(String[] args) {
        List<Double> a = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 20.0, 25.0, 30.0);
        List<Double> b = Arrays.asList(1.0, 2.0, 5.0, 4.0);
        List<Double> c = Arrays.asList(15.0, 20.0, 22.0, 21.0, 40.0);

        System.out.println(isSorted(a));
        System.out.println(isSorted(b));
        System.out.println(isSorted(c));

    }

}
