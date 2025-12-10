package Array.java;

public class FindEvenNumberDigits {

    public static boolean isEven(int n) {

        String s = Integer.toString(n);

        return s.length() % 2 == 0 ? true : false;
    }


    public static int findNumbers(int[] nums) {
        int count = 0;

        for(int n : nums) {
            if(isEven(n)) count++;
        }

        return count;
    }

    public static void main(String[] args) {

        System.out.println(findNumbers(new int[]{12,345,2,6,7896}));
        System.out.println(findNumbers(new int[]{555,901,482,1771}));
    }

}
