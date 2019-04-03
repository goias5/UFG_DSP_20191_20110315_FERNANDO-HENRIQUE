/**
 * Created by aluno on 02/04/19.
 */
public class Aula {
    private int numero;
    private boolean frequencia;

    public Aula(int numero, boolean frequencia) {
        this.numero = numero;
        this.frequencia = frequencia;
    }

    public Aula() {
    }

    @Override
    public String toString() {
        return "Aula{" +
                "numero=" + numero +
                ", frequencia=" + frequencia +
                '}';
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isFrequencia() {
        return frequencia;
    }

    public void setFrequencia(boolean frequencia) {
        this.frequencia = frequencia;
    }
}
