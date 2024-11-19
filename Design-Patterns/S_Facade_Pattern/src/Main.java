import Scenario1.Employee;
import Scenario1.EmployeeFacade;
import Scenario2.OrderFacade;

public class Main {
    public static void main(String[] args) {
        // Scenario1
        EmployeeFacade employeeFacade = new EmployeeFacade();
        Employee employeeDetails = employeeFacade.getEmployeeDetails("1212");

        // Scenario2
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.createOrder();
        System.out.println("order created");
    }
}