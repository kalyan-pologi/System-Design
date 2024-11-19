package SRP;

public class Main {
    public static void main(String[] args) {
//        EmployeeInfo info = new EmployeeInfo("John Doe", 101, "IT");
//        EmployeeSalaryCalculation salaryCalc = new EmployeeSalaryCalculation();
//        EmployeeEmails emailService = new EmployeeEmails();
//        EmployeeReport reportService = new EmployeeReport();
//
//        double salary = salaryCalc.calculateSalary(160, 50);
//        System.out.println("Salary: $" + salary);
//        emailService.sendEmail("john@example.com", "Your salary has been processed.");
//        reportService.generateReport(info);
        // Create EmployeeInfo object
        EmployeeInfo info = new EmployeeInfo("John Doe", 101, "IT");

        // Use Facade to handle all operations
        EmployeeServiceFacade facade = new EmployeeServiceFacade(info);
        facade.processEmployee(160, 50, "john@example.com");
    }
}
