import java.util.ArrayList;

// Employee class
class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public void displayEmployee() {
        System.out.println("Employee: " + name);
    }
}

// Department class containing Employees
class Department {
    String departmentName;
    ArrayList<Employee> employees;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void showEmployees() {
        System.out.println("Department: " + departmentName);
        for (Employee e : employees) {
            e.displayEmployee();
        }
    }
}

// Company class containing Departments (composition)
class Company {
    String companyName;
    ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void showCompanyStructure() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.showEmployees();
        }
    }

    // When company is deleted, departments and employees should no longer be accessible.
    public void closeCompany() {
        departments.clear();  // removes all department references
        System.out.println(companyName + " is closed. All departments and employees are removed.");
    }
}

// Demonstration
public class CompositionDemo {
    public static void main(String[] args) {
        Company comp = new Company("Tech Solutions");

        Department dev = new Department("Development");
        Department hr = new Department("HR");

        Employee e1 = new Employee("John");
        Employee e2 = new Employee("Amy");
        Employee e3 = new Employee("Tom");

        dev.addEmployee(e1);
        dev.addEmployee(e2);

        hr.addEmployee(e3);

        comp.addDepartment(dev);
        comp.addDepartment(hr);

        comp.showCompanyStructure();

        comp.closeCompany();
        comp.showCompanyStructure(); // no output since departments cleared
    }
}
