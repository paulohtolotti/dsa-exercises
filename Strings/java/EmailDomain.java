
import entities.EmailInfo;

public class EmailDomain {
    public static void main(String[] args) {
        String email1 = "yu_nakamura@gmail.com";
        String email2 = "jose_Carlos@yahoo.com.br";
        String email3 = " marcos@marcos.br";
        String email4 = "chie_Stk@pm.me";

        System.out.println(extractEmailInformation(email1).isBrazilianDomain());
        System.out.println(extractEmailInformation(email2).isBrazilianDomain());
        System.out.println(extractEmailInformation(email3).isBrazilianDomain());
        System.out.println(extractEmailInformation(email4).isBrazilianDomain());

        String day = "01";
        System.out.println(String.valueOf(day).charAt(1));
    }

    public static EmailInfo extractEmailInformation(String email) {
        /*
        *   Method that extracts the user, domain and nationality
        */
        String[] emailData = email.split("@");
        
        return new EmailInfo(emailData[0], emailData[1]);
    }
}
