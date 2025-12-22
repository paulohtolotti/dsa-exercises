package Recursividade;

import java.util.Arrays;
import java.util.List;

public class SumList {
    /**
     * Função que recebe uma lista de números reais e realiza sua soma.
     * Chama uma função com recursividade de cauda para resolver o problema.
     * @param list
     * @return
     */
    public static double sumList(List<Double> list) {

        if(list.size() == 0) return 0;

        return tailSumList(list, 0.0);
    }

    /**
     * Função com recursividade de cauda que realiza a soma de todos os números de uma lista.
     * Utiliza uma variável acumuladora, que se soma à cabeça da lista. A função é, então,
     * chamada novamente passando a cauda da lista como novo parâmetro.
     * @param list
     * @param total
     * @return
     */
    public static double tailSumList(List<Double> list, double total) {

        if(list.size() == 0) return total;

        double head = list.get(0);
        total += head;

        List<Double> tail = list.subList(1, list.size());

        return tailSumList(tail, total );
    }

    public static void main(String[] args) {
        List<Double> a = Arrays.asList(4.0, 5.0, 3.0);
        List<Double> b = Arrays.asList(4.40, 5.3576, 3.98798);

        System.out.println(sumList(a));
        System.out.println(sumList(b));
    }
}
