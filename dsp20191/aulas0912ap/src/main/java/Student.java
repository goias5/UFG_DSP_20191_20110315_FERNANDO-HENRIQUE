import java.util.ArrayList;

/**
 * Created by aluno on 02/04/19.
 */
public class Student {
    private int matricula;
    private String firstName;
    private String lastName;
    private String nickName;
    private ArrayList<Aula> frequencia;

    public Student(int matricula, String firstName, String lastName, String nickName, ArrayList<Aula> frequencia) {
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
        for(int i=0; i<frequencia.size(); i++){
            frequenciaString = frequenciaString.concat(frequencia.get(i).toString());
        }
        return "Student{" +
                "matricula=" + matricula +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", frequencia=" + frequenciaString +
                '}';
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
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

    public ArrayList<Aula> getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(ArrayList<Aula> frequencia) {
        this.frequencia = frequencia;
    }
}
