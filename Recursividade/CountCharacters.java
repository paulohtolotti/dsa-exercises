package Recursividade;

public class CountCharacters {

    /**
     * Função recursiva para contar quantas vezes o caracter ch aparece na string text.
     * Usa uma função com recursividade de cauda para realizar a contagem.
     * @param ch
     * @param text
     * @return
     */
    public static int charCount(char ch, String text) {

        return tailCharCount(ch, text.toLowerCase(), 0, 0);
    }

    public static int tailCharCount(char ch, String text, int index, int count) {

        if(text.length()-1 == index) return count;

        if(text.charAt(index) == ch) count ++;

        return tailCharCount(ch, text, index+1, count);
    }

    public static void main(String[] args) {
        String text = "Batata para o bebê";
        String t = "A arara arquejou sobre o arranhaceu";

        char c = 'a';
        char ch = 'b';

        System.out.println(charCount(ch, text));
        System.out.println(charCount(c, t));

    }
    
}
