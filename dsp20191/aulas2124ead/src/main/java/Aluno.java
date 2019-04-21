import java.io.Serializable;

public class Aluno implements Serializable {
    private String nome;
    private int matricula;
    private String disciplina;
    private int frequencia;
    private double nota1;
    private double nota2;

    public Aluno(String nome, int matricula, String disciplina, int frequencia, double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplina = disciplina;
        this.frequencia = frequencia;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public String aferirAvaliacao() {
        double media = (this.nota1 + this.nota2) / 2;
        if (this.frequencia >= 75) {
            if (media >= 6) {
                return "aprovado";
            } else {
                return "reprovado";
            }
        } else {
            if (media >= 6) {
                return "reprovado por falta";
            } else {
                return "reprovado por media e faltas";
            }
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", disciplina='" + disciplina + '\'' +
                ", frequencia=" + frequencia +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                '}';
    }
}
