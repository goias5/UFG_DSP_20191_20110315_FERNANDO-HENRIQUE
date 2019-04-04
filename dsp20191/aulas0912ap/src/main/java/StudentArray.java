import java.util.ArrayList;

public class StudentArray {
    public ArrayList<Student> student;

    public ArrayList<Student> getStudent() {
        return student;
    }

    public void setStudent(ArrayList<Student> student) {
        this.student = student;
    }

    public StudentArray(ArrayList<Student> student) {
        this.student = student;
    }

    public StudentArray() {
    }
}
