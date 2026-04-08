import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Problema valid-parenthesis Leetcode (https://leetcode.com/problems/valid-parentheses/description/)
 * Checar se uma String com (), {} ou [] é válida.
 * 
 */
public class ValidParenthesis {
    
    public static void main(String[] args) {
        System.out.println(validParenthesis("()"));
        System.out.println(validParenthesis("(){}"));
        System.out.println(validParenthesis("([])"));
        System.out.println(validParenthesis("(](}{})"));
        System.out.println(validParenthesis(")){}"));
        System.out.println(validParenthesis("][{}"));
        System.out.println(validParenthesis("{}(][)"));
    }

    public static boolean validParenthesis(String text) {
        int size = text.length();
        Deque<Character> stack = new ArrayDeque<>();

        for(int i = 0; i < size; i++) {
            if(text.charAt(i) == '(' || text.charAt(i) == '{' || text.charAt(i) == '[') {
                char c = text.charAt(i);
                stack.push(c);

            } else {
                if(stack.isEmpty()) return false;
                char popped = stack.pop();
                if(text.charAt(i) == ')' && popped != '(') return false;
                if(text.charAt(i) == ']' && popped != '[') return false;
                if(text.charAt(i) == '}' && popped != '{') return false;
            }
        }

        return stack.isEmpty();
    }
}
