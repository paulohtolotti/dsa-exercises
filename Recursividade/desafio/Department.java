package Recursividade.desafio;

public class Department {
    private String id;
    private String date;
    private Double price;
    private String name;

    public Department() {

    }

    /**
     * Construtor que recebe um csv e instancia um departamento.
     * @param csv
     */
    public Department(String csv) {
        String[] data = csv.split(",");
        this.id = data[0];
        this.date = data[1];
        this.price = Double.parseDouble(data[2]);
        this.name = data[3];
    }

    public String getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public Double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    
}
