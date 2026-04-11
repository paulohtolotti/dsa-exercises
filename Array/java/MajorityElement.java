/**
 * Problema referência: https://leetcode.com/problems/majority-element/submissions/1972658975/?envType=study-plan-v2&envId=top-interview-150
 * Solução utilizada: tabela hash para contar as ocorrências
 * Complexidade temporal: O(N)
 */
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> hash = new HashMap<>();
        int size = nums.length; int majority = size / 2; 

        for(int i = 0; i < size; i++) {
            // Cria a chave se não existir, e se existir soma por 1
            hash.merge(nums[i], 1, Integer::sum);
        }

        int r = 0;
        for(Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            if(entry.getValue() > majority) {
                r = entry.getKey();
            }
        }

        return r;
    }

    public static void main(String[] args) {
        int arr[] = {3 ,2, 3};
        int arr2[] = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(arr));
        System.out.println(majorityElement(arr2));

    }
}
