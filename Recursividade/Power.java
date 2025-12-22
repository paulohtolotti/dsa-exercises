package Recursividade;

public class Power {
    public static int power(int a, int b) {

        if(b == 0) return 1;

        return tailPower(a, b, 1);
    }

    public static int tailPower(int a, int b , int c) {

        if( b == 0) return c;

        return tailPower(a, b-1, c*a);
    }

    public static void main(String[] args) {
        System.out.println(power(3, 2));
        System.out.println(power(3, 3));
        System.out.println(power(2, 10));
        System.out.println(power(10, 4));
    }
}
