package Array.java;

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int size = nums1.length;
        int k = size - n;
        
        for(int i=0; i<n; i++) {
            nums1[k+i] = nums2[i];
        }

        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        
    }
}
