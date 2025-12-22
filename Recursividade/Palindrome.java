package Recursividade;

public class Palindrome {
    public static boolean isPalindrome(String text) {

        if(text.length() == 0) return true;

        return tailPalindrome(text.toLowerCase(), 0, text.length()-1);
    }

    public static boolean tailPalindrome(String text, int i, int f) {

        if(i == f) return true;

        if(text.charAt(i) != text.charAt(f)) return false;

        return tailPalindrome(text, i+1, f-1);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("ana"));
        System.out.println(isPalindrome("arara"));
        System.out.println(isPalindrome("joaquim"));
    }
}
