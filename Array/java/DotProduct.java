package Array.java;

public class DotProduct {
    
    /**
     * Retorna o produto escalar entre dois vetores, dado pelo somatório do produto de i x j.
     * @param arr 
     * @param arr2
     * @return 
     */
    public static int dotProduct(int[] arr, int[] arr2) {

        if(arr.length != arr2.length) return 0;

        int size = arr.length;
        int total = 0;

        for(int i=0; i<size; i++) {
            total += arr[i] * arr2[i];
        }

        return total;
    }

    public static void main(String[] args) {

        System.out.println(dotProduct(new int[]{1,0,0,2,3}, new int[] {0,3,0,4,0}));
        System.out.println(dotProduct(new int[]{0,1,0,0,2,0,0}, new int[]{1,0,0,0,3,0,4}));
    }
}
