package Recursividade;

public class Countdown {
    public static void countdown(int n) {
        if (n < 0 ) return;

        System.out.println(n);
        countdown(n-1);
    }

    public static void main(String[] args) {
        countdown(55);
    }
}
