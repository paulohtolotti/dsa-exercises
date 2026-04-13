import java.util.Set;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Intersection {

    // Ficou lento
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> A = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> B = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        List<Integer> C = new ArrayList<>();
        B.forEach(b -> { 
            if(A.contains(b)) {
                C.add(b);
            }
        });
        return C.stream().mapToInt(Integer::intValue).toArray();
    }

    // Solução melhorou
    public static int[] intersection2(int[] nums1, int[] nums2) { 
    HashSet<Integer> set1 = new HashSet<>();
    HashSet<Integer> set2 = new HashSet<>();

    for (int i : nums1) {
        set1.add(i);
    }

    for(int i : nums2) {
        set2.add(i);
    }

    set1.retainAll(set2);
    int[] res = new int[set1.size()]; int idx = 0;
    
    for(int i : set1) {
        res[idx++] = i;
    }

    return res;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] nums3 = {4, 9, 5};
        int[] nums4 = {9,4,9,8,4};
        int[] res = intersection2(nums1, nums2);
        int[] res2 = intersection2(nums3, nums4);

        for(int i : res) {
            System.out.println(i);
        }
        for(int i : res2) {
            System.out.println(i);
        }
    }
}
