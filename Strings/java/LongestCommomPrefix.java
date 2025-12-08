import java.util.Arrays;

public class LongestCommomPrefix {
    
    public static String longestCommomPrefix(String[] v) {

        if(v.length == 1) return v[0];

        StringBuilder sb = new StringBuilder();

        // Arrays.sort(v, Comparator.comparingInt(String::length));
        Arrays.sort(v);
        String l = v[v.length - 1];

        for(int i=0; i<v[0].length(); i++) {

            if(v[0].charAt(i) != l.charAt(i)) break;

            sb.append(l.charAt(i));
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
