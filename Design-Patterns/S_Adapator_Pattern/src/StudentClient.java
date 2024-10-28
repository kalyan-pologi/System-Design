import java.util.ArrayList;
import java.util.List;

public class StudentClient {

    public List<Student> getStudentList(){
        List<Student> students = new ArrayList<>();

        CollegeStudent collegeStudent = new CollegeStudent("a","b","c");
        SchoolStudent schoolStudent = new SchoolStudent("x","y","z");

        students.add(collegeStudent);
        students.add(new SchoolStudentAdapter(schoolStudent));
        return students;

    }
}
