package Array.java;

import java.util.Arrays;

public class SortedSquares {
    
    //Brute force
    public static int[] sortedSquares(int[] nums) {

        int[] sortedArray = new int[nums.length];
        int size = nums.length;

        for(int i=0; i<size; i++) {
            sortedArray[i] = nums[i] * nums[i];
        }

        Arrays.sort(sortedArray);
        
        return sortedArray;
    }

    public static int[] sortedSquaresTwoPointer(int[] nums) {

        int left = 0, rigth = nums.length - 1;
        int[] sorted = new int[nums.length];
        int index = nums.length - 1;

        while(left <= rigth) {
            if(Math.abs(nums[left]) > Math.abs(nums[rigth])) {
                sorted[index] = nums[left] * nums[left];
                index--;
                left++;

            } else {
                sorted[index] = nums[rigth] * nums[rigth];
                index--;
                rigth--;
            }
        }

        return sorted;
    }

    public static void main(String[] args) {
        
        int[] arr = sortedSquares(new int[]{-4,-1,0,3,10});
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(sortedSquares(new int[]{-7,-3,2,3,11})));
    }
}
