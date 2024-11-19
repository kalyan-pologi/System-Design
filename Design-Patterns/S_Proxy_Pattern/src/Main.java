public class Main {
    public static void main(String[] args) {
        try{
            EmployeeDao empTableObj = new EmployeeDaoProxy();
            empTableObj.create("ADMIN", new EmployeeDo());
            System.out.println("operation successfully");
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}