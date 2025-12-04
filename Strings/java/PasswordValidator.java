public class PasswordValidator {
        
        /**
        * Função que valida uma senha usando os critérios: 8 caracteres,
        * uma letra, um digito e um caracter especial (@, #, &).
        * 
        * @param password: senha a ser validada.
        * @return true se a senha for validada, ou false se não atender.
        */
    public static boolean validatePassword(String password) {
        
        int minimunLength = 8;

        //Regex que testa se possui ao menos uma letra, maiúscula ou minúscula
        String regexLetter = ".*[a-zA-Z]+.*";
        //Regex que testa se existe um digito ao menos
        String regexDigit = ".*\\d+.*";
        //Regex para testar caracteres especiais
        String regexSpecialCharacters = ".*(\\W)+.*";

        return  password.matches(regexLetter) 
                && password.matches(regexDigit) 
                && password.matches(regexSpecialCharacters)
                && password.length() >= minimunLength;

    }

    //Bloco de teste
    public static void main(String[] args) {

        System.out.println(validatePassword("abcd10#$@")); // true
        System.out.println(validatePassword("abcd#$@")); // false
        System.out.println(validatePassword("#$@1023#$@"));
        System.out.println(validatePassword("abcabdebdasubdsa"));
        System.out.println(validatePassword("A@#10101010101010"));

    }
}
