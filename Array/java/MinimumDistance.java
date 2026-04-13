/**
 * Problema referência: https://leetcode.com/problems/minimum-distance-to-the-target-element/description/?envType=daily-question&envId=2026-04-13
 * Dado um array de inteiros, target e um start, retornar o menor valor possível que atenda a condição:
 * - nums[i] == target
 * - mínimo para | i - start |
 */
public class MinimumDistance {
    public static int getMinDistance(int[] nums, int target, int start) {
        int minimum = -1; // flag para a 1ª iteração

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                int currentDistance =  Math.abs(i - start);
                if(minimum == -1) minimum = currentDistance;
                else minimum = minimum < currentDistance ? minimum : currentDistance;
            }
        }

        return minimum;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] nums2 = {1,1,1,1,1,1,1,1,1,1};
        int[] nums3 = {5,3,6};

        System.out.println(getMinDistance(nums, 5, 3));
        System.out.println(getMinDistance(nums2, 1, 0));
        System.out.println(getMinDistance(nums3, 5, 2));    
    
    }
}
