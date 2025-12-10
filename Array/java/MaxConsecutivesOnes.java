package Array.java;

import java.util.Arrays;

public class MaxConsecutivesOnes {
    
    //Solução menos eficiente. O(n²)
    public static int maxOnes(int[] nums) {

        int temp, max = 0, size = nums.length;

        for(int i=0; i<size; i++) {

            if(nums[i] == 1) temp = 1;
            else temp = 0;

            for(int j=i+1; j<size; j++) {
                if(nums[j] == 0) break;
                temp ++;
            }

            if(temp > max) max = temp;
            
        }

        return max;
    }

    //Solução mais eficiente O(n)
    public static int maxOnes2(int[] nums) {

        int temp=0, max=0, size = nums.length;

        for (int i=0; i<size; i++) {

            if(nums[i] == 1) temp ++;

            if(nums[i] != 1 && temp > 0) {
                max = max > temp ? max : temp; //Checa se a contagem atual é a maior.
                temp = 0;
            }
        }

        return max > temp ? max : temp;
    }
    public static void main(String[] args) {

        int[] nums = {1,1,0,1,1,1};
        int[] nums2 = {1,0,1,1,0,1};

        System.out.println(maxOnes2(nums));
        System.out.println(maxOnes2(nums2));
    }    
}
