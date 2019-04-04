/**
 * Created by aluno on 02/04/19.
 */
public class Student {
    public String matricula;
    public String firstname;
    public String lastname;
    public String nickname;
    public Frequencia frequencia;

    public Student(String matricula, String firstName, String lastName, String nickName, Frequencia frequencia) {
        this.matricula = matricula;
        this.firstname = firstName;
        this.lastname = lastName;
        this.nickname = nickName;
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
                ", firstName='" + firstname + '\'' +
                ", lastName='" + lastname + '\'' +
                ", nickName='" + nickname + '\'' +
                ", frequencia=" + frequenciaString +
                '}'+'\n';
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastName) {
        this.lastname = lastName;
    }

    public String getNickName() {
        return nickname;
    }

    public void setNickName(String nickName) {
        this.nickname = nickName;
    }

    public Frequencia getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(Frequencia frequencia) {
        this.frequencia = frequencia;
    }
}
