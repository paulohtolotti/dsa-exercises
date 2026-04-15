package entities;

import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;

public class Department implements Comparable<Department> {

    private Long id;
    private String name;
    List<Employee> employees = new ArrayList<>();

    public Department(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    
    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }
    

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public int compareTo(Department other) {
        return Comparator.
            comparing(Department::getName)
            .compare(this, other);
    }
}