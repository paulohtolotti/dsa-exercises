
import entities.EmailInfo;

public class EmailDomain {
    public static void main(String[] args) {
        String email1 = "yu_nakamura@gmail.com";
        String email2 = "jose_Carlos@yahoo.com.br";
        String email3 = " marcos@marcos.br";
        String email4 = "chie_Stk@pm.me";

        System.out.println("marcos@marcos.br".matches(".*\\.br"));

        System.out.println(extractEmailInformation(email1).isBrazilianDomain());
        System.out.println(extractEmailInformation(email2).isBrazilianDomain());
        System.out.println(extractEmailInformation(email3).isBrazilianDomain());
        System.out.println(extractEmailInformation(email4).isBrazilianDomain());
    }

    /**
     * 
     * @param email contém o email de um usuário
     * @return objeto do tipo EmailInfo, usado para validar se o domínio é br
     */
    public static EmailInfo extractEmailInformation(String email) {
        String[] emailData = email.split("@");
    
        return new EmailInfo(emailData[0], emailData[1]);
    }
}
