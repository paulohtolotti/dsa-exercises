package Recursividade;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {
    public static <T> List<T> reverseList(List<T> list) {
        List<T> listB = new ArrayList<>();
        if(list.size() == 0) return list;

        return tailReverseList(listB, list);
    }

    public static <T> List<T> tailReverseList(List<T> listB, List<T> list) {

        if(list.size() == 0) return listB;

        listB.add(list.get(list.size()-1));
        list.remove(list.size()-1);

        return tailReverseList(listB, list);
    }
    
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        List<Integer> b = new LinkedList<>();
        List<Double> c = new ArrayList<>();

        a.add("Maçã");
        a.add("Pera");
        a.add("Uva");
        a.add("Morango");

        c.add(7.75);
        c.add(3.14);
        c.add(9.18);
        c.add(6.23);

        System.out.println(reverseList(a));
        System.out.println(reverseList(b));
        System.out.println(reverseList(c));
    }
}
