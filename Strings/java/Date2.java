public class Date2 {
    
    public static String formatDate(int day, int month, int year) {
        /*
        *   Função que formata uma data no formato dd/MM/yyyy, inserindo
        *   um 0 à esquerda de dias e meses menores que 10.
        *
        */
        StringBuilder sb = new StringBuilder();
        
        sb.append(String.format("%02d", day));
        sb.append("/");
        sb.append(String.format("%02d", month));
        sb.append("/");
        sb.append(year);

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(formatDate(10, 9, 2025));

    }
}
