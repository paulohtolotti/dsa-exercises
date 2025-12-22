package Recursividade;

public class Fatorial {
    /**
     * Função auxiliar que recebe um número n e chama a função que calcula o fatorial de n usando
     * recursividade de cauda
     *
     * @param n Fatorial desejado
     * @return 
     */
    public static int fatorial(int n) {
        return tailFatorial(n, 1);
    }

    public static int tailFatorial(int n, int f) {
        if(n == 1) return f;

        return tailFatorial(n-1, f*n);
    }
    
    public static void main(String[] args) {
        System.out.println(fatorial(5));
        System.out.println(fatorial(6));
        System.out.println(fatorial(4));
    }
}
