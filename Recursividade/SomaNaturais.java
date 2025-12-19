package Recursividade;

public class SomaNaturais {

    /**
     * Função auxiliar, que é chamada recebendo apenas 1 parâmetro e invoca a função 
     * de recursividade de cauda para somar
     * @param n
     * @return
     */
    public static int sumNaturals(int n) {
        return tailSumNaturals(n, 0);
    }

    /**
     * 
     * Função de recursividade de cauda para calcular a soma do N primeiros números naturais
     * @param n Quantidade de termos a serem somados
     * @param s Acumulador da soma
     * @return 
     */
    public static int tailSumNaturals(int n, int s) {

        if(n == 0) return s;

        return tailSumNaturals(n-1, s+n);
    }

    public static void main(String[] args) {
        System.out.println(sumNaturals(0));
        System.out.println(sumNaturals(2));
        System.out.println(sumNaturals(4));
    }
}
