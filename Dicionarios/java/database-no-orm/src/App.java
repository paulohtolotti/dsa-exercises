import java.util.List;
import java.util.Map;
import java.util.HashMap;

import entities.Department;
import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {

        String[] records = {"57,Vendas,8032,Meire Silva,8000.0,57",
                "32,Estoque,4368,Dom Dias,7000.0,32",
                "57,Vendas,3298,Pedro Neto,8500.0,57",
                "57,Vendas,8639,Carol Souza,9000.0,57",
                "18,Marketing,6421,Davi Souto,7500.0,18",
                "32,Estoque,7523,Lara Matos,8000.0,32",
                "18,Marketing,2732,Bob Costa,6500.0,18"
            };

        String[] records2 = {   
            "57,Vendas,8032,Meire Silva,8000.0,57",
            "18,Marketing,6421,Davi Souto,7500.0,18",
            "18,Marketing,2732,Bob Costa,6500.0,18"
        
        };

        System.out.println("Records 1");
        printDepartments(convertRecords(records));

        System.out.println("Records 2");
        printDepartments(convertRecords(records2));

    }

    /**
     * data position
     * 0 - Dept id
     * 1 - Dept name
     * 2 - Emp id
     * 3 - Emp name
     * 4 - Emp salary
     * 5 - Dept id
     */
    public static List<Department> convertRecords(String[] records) {
        
        Map<Long, Department> departmentMap = new HashMap<>();
        
        for(String record : records) {
            String[] data = record.split(",");

            Long id = Long.parseLong(data[0]);
            Long empId = Long.parseLong(data[2]);
            String empName = data[3];
            Double salary = Double.parseDouble(data[4]);
            
            if(departmentMap.containsKey(id)) {
                Department department = departmentMap.get(id);
                Employee employee = new Employee(empId, empName, salary, department);
                
                department.addEmployee(employee);

                departmentMap.replace(id, department);

            } else {
                String deptName = data[1];

                Department department = new Department(id, deptName);
                Employee employee = new Employee(empId, empName, salary, department);

                department.addEmployee(employee);

                departmentMap.put(id, department);
            }
        }

        return departmentMap.values().stream().sorted().toList();
    }

    public static void printDepartments(List<Department> departments) {
        for(Department department : departments) {
            System.out.println(department.getName() + ":");
            for(Employee employee : department.getEmployees()) {
                System.out.println("\t" + employee.getId() + ": " + employee.getName() + ", $ " + employee.getSalary());
            }
        }
        System.out.println();
    }
}
