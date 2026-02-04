// Base abstract class
// Iska object directly nahi banega
 abstract class Employee {

    private String name;
    private int id;

    // Constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // Har employee apni salary khud calculate karega
    public abstract double calculateSalary();

    // Print ke time ye chalega
    @Override
    public String toString() {
        return "Employee [name=" + name +
                ", id=" + id +
                ", salary=" + calculateSalary() + "]";
    }
}

public class Main {

    public static void main(String[] args) {

        PayrollSystem payrollSystem = new PayrollSystem();

        Employee emp1 =
                new FullTimeEmployee("John Doe", 101, 5000.0);

        Employee emp2 =
                new PartTimeEmployee("Jane Smith", 102, 30, 15.0);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);

        System.out.println("Initial Employee Details:");
        payrollSystem.displayEmployees();

        System.out.println("\nRemoving Employee...");
        payrollSystem.removeEmployee(101);

        System.out.println("\nRemaining Employee Details:");
        payrollSystem.displayEmployees();
    }
}
