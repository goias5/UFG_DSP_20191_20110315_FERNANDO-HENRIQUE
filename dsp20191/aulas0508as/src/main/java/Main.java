import java.io.IOException;

/**
 * Created by Alunoinf_2 on 21/03/2019.
 */
public class Main {
    public static void main(String args[]) throws IOException {
        Aluno aluno1 = new Aluno("Lucas",new Long(122709), 8, 7);
        Aluno aluno2 = new Aluno("Matheus",new Long(198091), 4.5, 6.8);
        Aluno aluno3 = new Aluno("Jorge",new Long(151421), 5.7, 9.1);
        Aluno aluno4 = new Aluno("Abrao Junior",new Long(100808), 10, 0);
        Aluno aluno5 = new Aluno("Joao",new Long(612808), 4, 2);
        GerenciadorDados.gravarAlunoArquivo(aluno1);
        GerenciadorDados.gravarAlunoArquivo(aluno2);
        GerenciadorDados.gravarAlunoArquivo(aluno3);
        GerenciadorDados.gravarAlunoArquivo(aluno4);
        GerenciadorDados.gravarAlunoArquivo(aluno5);
        GerenciadorDados.lerAlunoArquivo();
    }
}
