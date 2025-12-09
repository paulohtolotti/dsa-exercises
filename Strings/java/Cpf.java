public class Cpf {
    public static void main (String[] args) {
        System.out.println("Test cases");
        System.out.println(removeNonDigits("874092172-93"));
        System.out.println(removeNonDigits("874.092.172-93"));
        System.out.println(removeNonDigits("        874092.172-93"));
        System.out.println(removeNonDigits("874.092.172-93       "));
    }

    /**
     * 
     * @param cpf CPF contendo ou não traços e pontos
     * @return número do cpf atualizado, sem caracteres especiais
     */
    public static String removeNonDigits(String cpf) {
        return cpf.trim().replaceAll("\\D", "");
    }
}