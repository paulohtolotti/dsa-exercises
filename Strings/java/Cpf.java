public class Cpf {
    public static void main (String[] args) {
        System.out.println("Test cases");
        System.out.println(removeNonDigits("874092172-93"));
        System.out.println(removeNonDigits("874.092.172-93"));
        System.out.println(removeNonDigits("        874092.172-93"));
        System.out.println(removeNonDigits("874.092.172-93       "));
    }

    public static String removeNonDigits(String cpf) {
        /*
        *   Method that recieves a string that can contain . and -
        *   Returns a String containing only numbers.
        */

        return cpf.trim().replaceAll("\\D", "");
    }
}