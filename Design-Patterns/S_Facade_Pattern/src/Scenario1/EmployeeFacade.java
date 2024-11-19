package Scenario1;

public class EmployeeFacade {
    EmployeeDao employeeDao;
    public EmployeeFacade(){
        employeeDao = new EmployeeDao();
    }
    public void insert(){

    }
    public Employee getEmployeeDetails(String empId) {
        return employeeDao.getEmployeeDetails(empId);
    }
}
