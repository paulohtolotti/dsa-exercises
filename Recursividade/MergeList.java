package Recursividade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeList {
    
    public static <T> List<T> merge(List<T> a, List<T> b) {

        List<T> c = new ArrayList<>();
        return tailMerge(a, b , c);
    }

    public static <T> List<T> tailMerge(List<T> a, List<T> b, List<T> c) {

        if(a.size() == 0) {
            c.addAll(b);
            return c;
        }

        if(b.size() == 0) {
            c.addAll(a);
            return c;
        }

        T headA = a.get(0);
        T headB = b.get(0);

        c.add(headA);
        c.add(headB);

        List<T> tailA = a.subList(1, a.size());
        List<T> tailB = b.subList(1, b.size());

        return tailMerge(tailA, tailB, c);
    }

    public static void main(String[] args) {
        List<String> a = Arrays.asList("ana", "maria");
        List<String> b = Arrays.asList("Tyrion", "Ned", "Rob", "John");

         List<String> c = Arrays.asList("Cersei", "Catelyn");
        List<String> d = Arrays.asList("Twin", "Shaga");

        System.out.println(merge(a, b));
         System.out.println(merge(c, d));
    }
}
