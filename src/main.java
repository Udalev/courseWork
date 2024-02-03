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

    }

    private static void findMaxSalaryEmployee() {

    }

    private static void calculateAverageSalary() {

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
