import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class StudentsClass {
    @SerializedName("class")
    public StudentArray student;

    public StudentsClass(StudentArray students) {
        this.student = students;
    }

    public StudentsClass() {
    }

    @Override
    public String toString() {
        String studentsString = new String();
        for (int i=0; i<this.student.getStudent().size(); i++){
            studentsString = studentsString.concat(this.student.getStudent().get(i).toString());
        }
        return  studentsString;
    }

    public StudentArray getStudents() {
        return student;
    }

    public void setStudents(StudentArray students) {
        this.student = students;
    }
}
