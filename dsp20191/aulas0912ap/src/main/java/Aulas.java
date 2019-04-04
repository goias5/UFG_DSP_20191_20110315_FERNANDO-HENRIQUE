import com.google.gson.annotations.SerializedName;

/**
 * Created by aluno on 02/04/19.
 */
public class Aulas {
    public String numero;
    @SerializedName("#text")
    public String frequencia;

    public Aulas(String numero, String frequencia) {
        this.numero = numero;
        this.frequencia = frequencia;
    }

    public Aulas() {
    }

    @Override
    public String toString() {
        return "Aulas{" +
                "numero=" + numero +
                ", frequencia=" + frequencia +
                '}';
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }
}
