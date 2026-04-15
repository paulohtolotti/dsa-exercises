package entities;

public class Employee {
    private Long id;
    private String name;
    private Double salary;
    Department department;

    public Employee(Long id, String name, Double salary, Department department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Double getSalary() {
        return salary;
    }

    
}
