import java.util.Arrays;

public class ValidAnagram {
    
    /**
     *  Problema valid anagram Leet Code. Converte as duas strings em array de char, ordena e compara.
     *  Complexidade temporal O(N log N): custo da ordenação (log N) e custo da comparação (N).
     *  @param r string de entrada
     *  @param s string de entrada
     *  @return b boolean representando se as strings são anagramas válidos
     */

    public static boolean isAnagram(String r, String s) {

        char[] charArrayR = r.toCharArray();
        char[] charArrayS = s.toCharArray();

        Arrays.sort(charArrayR);
        Arrays.sort(charArrayS);

        return Arrays.equals(charArrayR, charArrayS);
    }

    /**
     *  Problema valid anagram Leet Code. Usa um array de frequência para contar quantas vezes os caracteres aparecem.
     *  Complexidade temporal O(N): custo de iterar sobre o array de frequencia
     *  @param r string de entrada
     *  @param s string de entrada
     *  @return b boolean representando se as strings são anagramas válidos
     */
    public static boolean isAnagram2(String r, String s) {

        if(s.length() != r.length() || r.equals(s)) return false;
        //Array de frequência com todos os caracteres da tabela ASCII. Inicia com todos os valores iguais a 0
        int[] frequency = new int[256];

        for(int i=0; i<r.length(); i++) {
            frequency[r.charAt(i)]++; // Soma um na posição inteira correspondente ao char de r
            frequency[s.charAt(i)]--; // Subtrai um na posição inteira correspondente ao char de s
        }
        

        for(int f : frequency) {
            //Se alguma posição não é 0 significa que algum caracter apareceu em um array e não no outro.
            if(f != 0) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));    // true
        System.out.println(isAnagram("rato", "tora"));  // true
        System.out.println(isAnagram("gato", "cachorro"));  //false
        System.out.println(isAnagram("aab", "abc"));  //false
    }
}
