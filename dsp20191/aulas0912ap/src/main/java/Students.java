import java.util.ArrayList;

public class Students {
    private ArrayList<Student> students;

    public Students(ArrayList<Student> students) {
        this.students = students;
    }

    public Students() {
    }

    @Override
    public String toString() {
        String studentsString = new String();
        for (int i=0; i<this.students.size(); i++){
            studentsString = studentsString.concat(this.students.get(i).toString());
        }
        return  studentsString;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
