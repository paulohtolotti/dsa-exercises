package entities;

public class EmailInfo {

    private String user;
    private String domain;

    public EmailInfo(String user, String domain) {
        this.user = user;
        this.domain = domain;
    }

    public boolean isBrazilianDomain() {
        return this.domain.endsWith(".br");
    }
}
