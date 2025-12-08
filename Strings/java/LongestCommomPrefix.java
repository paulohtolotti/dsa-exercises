import java.util.Arrays;

public class LongestCommomPrefix {
    
    public static String longestCommomPrefix(String[] v) {

        if(v.length == 1) return v[0];

        StringBuilder sb = new StringBuilder();

        // Arrays.sort(v, Comparator.comparingInt(String::length));
        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length - 1];

        int min = first.length() < last.length() ? first.length() : last.length();

        for(int i=0; i<min; i++) {

            if(first.charAt(i) != last.charAt(i)) break;

            sb.append(last.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] v1 = {"flowers", "flow", "fligth"};
        String[] v2 = {"dog", "car", "carrot"};
        String[] v3 = {"dog", "doggg", "dogug", "dogi"};
        String[] v4 = {"dog33"};

        System.out.println(longestCommomPrefix(v1));
        System.out.println(longestCommomPrefix(v2));
        System.out.println(longestCommomPrefix(v3));
        System.out.println(longestCommomPrefix(v4));

    }
}
