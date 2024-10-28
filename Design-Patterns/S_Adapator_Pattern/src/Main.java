// Makes incompatible interfaces work together. Converts one interface to another for compatibility.
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentClient client = new StudentClient();
        List<Student> studentList = client.getStudentList();
        System.out.println(studentList);
    }
}