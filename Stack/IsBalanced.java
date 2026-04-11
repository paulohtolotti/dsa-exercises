import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Problema is-balanced.
 * Avalia uma String de parênteses e checa se está balanceada, ou seja, se todo parênteses aberto está fechado.
 * Implementação de operações de fila (push e pop) de maneira simplificada, via lista.
 * (: adiciona '(' na pilha
 * ): remove '(' da pilha.
 */
public class IsBalanced {
    
    public static void main(String[] args) {
        String a = "()()"; // true
        String b = "(())"; // true
        String c = "()())("; // false;
        String d = "))(("; // false;

        System.out.println(isBalanced(a));
        System.out.println(isBalanced(b));
        System.out.println(isBalanced(c));
        System.out.println(isBalanced(d));

    }

    public static boolean isBalanced(String expression) {
        Deque<String> l = new ArrayDeque<>();
        int size = expression.length();
        if(size == 0) return false;

        for(int i = 0; i < size; i++) {
            if(expression.charAt(i) == '(') {
                l.push("(");
            } 

            if(expression.charAt(i) == ')') {
                if(l.isEmpty()) return false; // Evitar lançar exceção
                l.pop();
            }
        }

        return l.isEmpty();
    }
}
