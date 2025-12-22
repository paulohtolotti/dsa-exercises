package Recursividade;

public class Fibonacci {
    
    public static int fib (int n) {
        if(n < 0) return -1;

        return tailFib(0, 1, n);
    }

    public static int tailFib(int a, int b, int n) {

        if(n == 0) return a;
        if (n == 1) return b;

        return tailFib(b, a+b, n-1);
    }

    public static void main(String[] args) {
        System.out.println(fib(6));
        System.out.println(fib(0));
        System.out.println(fib(45));
    }
}
