import java.util.Arrays;

class EmployeeManagement {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        initializeEmployees();
        printAllEmployees();
        calculateTotalSalary();
        findMinSalaryEmployee();
        findMaxSalaryEmployee();
        calculateAverageSalary();
        printEmployeeNames();
    }

    private static void initializeEmployees() {
        employees[0] = new Employee("John Doe", 1, 5000);
        employees[1] = new Employee("Jane Smith", 2, 6000);
        // Добавьте еще сотрудников по аналогии...
    }

    private static void printAllEmployees() {
        System.out.println("All Employees:");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    private static void calculateTotalSalary() {
        double totalSalary = Arrays.stream(employees)
                .filter(employee -> employee != null)
                .mapToDouble(Employee::getSalary)
                .sum();
        System.out.println("Total Salary: " + totalSalary);
    }

    private static void findMinSalaryEmployee() {
        Employee minSalaryEmployee = Arrays.stream(employees)
                .filter(employee -> employee != null)
                .min((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
                .orElse(null);

        if (minSalaryEmployee != null) {
            System.out.println("Employee with Min Salary: " + minSalaryEmployee);
        } else {
            System.out.println("No employees found");
        }
    }

    private static void findMaxSalaryEmployee() {
        Employee maxSalaryEmployee = Arrays.stream(employees)
                .filter(employee -> employee != null)
                .max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
                .orElse(null);

        if (maxSalaryEmployee != null) {
            System.out.println("Employee with Max Salary: " + maxSalaryEmployee);
        } else {
            System.out.println("No employees found");
        }
    }

    private static void calculateAverageSalary() {
        double averageSalary = Arrays.stream(employees)
                .filter(employee -> employee != null)
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);

        System.out.println("Average Salary: " + averageSalary);
    }

    private static void printEmployeeNames() {
        System.out.println("Employee Names:");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}