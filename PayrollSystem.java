import java.util.ArrayList;

// Ye class employees ko manage karegi
public class PayrollSystem {

    private ArrayList<Employee> employees;

    public PayrollSystem() {
        employees = new ArrayList<>();
    }

    // Add employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Remove employee by id
    public void removeEmployee(int id) {

        Employee employeeToRemove = null;

        // Employee dhundho
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                employeeToRemove = emp;
                break;
            }
        }

        // Agar mila to remove karo
        if (employeeToRemove != null) {
            employees.remove(employeeToRemove);
        }
    }

    // Display all employees
    public void displayEmployees() {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
