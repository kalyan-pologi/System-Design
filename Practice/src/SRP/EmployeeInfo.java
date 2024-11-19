package SRP;

public class EmployeeInfo {
    private String name;
    private int id;
    private String department;

    public EmployeeInfo(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public String getName() {
        return name;
    }
}
