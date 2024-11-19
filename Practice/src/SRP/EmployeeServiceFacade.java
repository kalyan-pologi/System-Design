package SRP;
public class EmployeeServiceFacade {
    private EmployeeInfo info;
    private EmployeeSalaryCalculation salaryCalc;
    private EmployeeEmails emailService;
    private EmployeeReport reportService;

    public EmployeeServiceFacade(EmployeeInfo info) {
        this.info = info;
        this.salaryCalc = new EmployeeSalaryCalculation();
        this.emailService = new EmployeeEmails();
        this.reportService = new EmployeeReport();
    }

    // Method to handle all employee operations
    public void processEmployee(int hoursWorked, double ratePerHour, String email) {
        double salary = salaryCalc.calculateSalary(hoursWorked, ratePerHour);
        System.out.println("Salary: $" + salary);
        emailService.sendEmail(email, "Your salary has been processed.");
        reportService.generateReport(info);
    }
}

