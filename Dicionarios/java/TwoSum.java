import java.util.Map;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        
        Map<Integer, Integer> complementMap = new HashMap<>();
        int complement;

        for(int i = 0; i < nums.length; i++) {

            if(complementMap.containsKey(nums[i])) {
                answer[1] = i;
                answer[0] = complementMap.get(nums[i]);
                return answer;
            } else {
                complement = target - nums[i];
                complementMap.put(complement, i);
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 4};
        int arr2[] = {3, 2, 4};

        int answer[] = twoSum(arr, 9);
        int answer2[] = twoSum(arr2, 7);

        for(int i : answer) {
            System.out.print(i + "\t");
        }

        System.out.println();        
        for(int i : answer2) {
            System.out.print(i + "\t");
        }
    }

}
