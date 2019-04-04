import java.util.ArrayList;

/**
 * Created by aluno on 03/04/19.
 */
public class Frequencia {
    private ArrayList<Aulas> aulas;

    public Frequencia(ArrayList<Aulas> aulas) {
        this.aulas = aulas;
    }

    public Frequencia() {
    }

    public ArrayList<Aulas> getAulas() {
        return aulas;
    }

    public void setAulas(ArrayList<Aulas> aulas) {
        this.aulas = aulas;
    }
}
