import java.util.ArrayList;

/**
 * Created by aluno on 02/04/19.
 */
public class Student {
    public String matricula;
    public String firstName;
    public String lastName;
    public String nickName;
    public Frequencia frequencia;

    public Student(String matricula, String firstName, String lastName, String nickName, Frequencia frequencia) {
        this.matricula = matricula;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.frequencia = frequencia;
    }

    public Student() {
    }

    @Override
    public String toString() {
        String frequenciaString = new String();
        for(int i=0; i<frequencia.getAulas().size(); i++){
            frequenciaString = frequenciaString.concat(frequencia.getAulas().get(i).toString());
        }
        return "Student{" +
                "matricula=" + matricula +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", frequencia=" + frequenciaString +
                '}';
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Frequencia getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(Frequencia frequencia) {
        this.frequencia = frequencia;
    }
}
