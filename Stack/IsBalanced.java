import java.util.List;
import java.util.ArrayList;

/**
 * Problema is-balanced.
 * Avalia uma String de parênteses e checa se está balanceada, ou seja, se todo parênteses aberto está fechado.
 * Implementação de operações de fila (push e pop) de maneira simplificada, via lista.
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
        List<String> l = new ArrayList<>();
        int size = expression.length();
        if(size == 0) return false;

        for(int i = 0; i < size; i++) {
            if(expression.charAt(i) == '(') {
                l.add("(");
            } 

            if(expression.charAt(i) == ')') {
                if(l.size() == 0) continue; // Evitar lançar exceção
                l.removeLast();
            }
        }

        return l.size() == 0 ? true : false;
    }
}
