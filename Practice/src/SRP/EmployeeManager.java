package SRP;
public class EmployeeManager {
    // Store employee information
    private String name;
    private int id;
    private String department;

    public EmployeeManager(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    // Calculate salary
    public double calculateSalary(int hoursWorked, double ratePerHour) {
        return hoursWorked * ratePerHour;
    }

    // Send email notifications
    public void sendEmail(String email, String message) {
        System.out.println("Sending email to: " + email);
        System.out.println("Message: " + message);
    }

    // Generate report
    public void generateReport() {
        System.out.println("Generating report for employee: " + name);
    }

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager("John Doe", 101, "IT");
        double salary = manager.calculateSalary(160, 50);
        System.out.println("Salary: $" + salary);
        manager.sendEmail("john@example.com", "Your salary has been processed.");
        manager.generateReport();
    }
}
