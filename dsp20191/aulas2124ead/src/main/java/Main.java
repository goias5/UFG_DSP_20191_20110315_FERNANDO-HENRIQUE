import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        gravarAlunos();
        lerAlunos();
    }

    public static void gravarAlunos(){
        Aluno aluno1 = new Aluno("Fernando",110315,"Software para persistência",85, 6.8, 7.4);
        Aluno aluno2 = new Aluno("Lucas",110342115,"Software para dispositivos móveis",75, 6.0, 5.9);
        Aluno aluno3 = new Aluno("Laura",41245,"Software para persistência",100, 6.0, 4.6);
        Aluno aluno4 = new Aluno("Pedro",1142112,"Software para dispositivos móveis",55, 6.0, 9.0);
        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);
        Empacotamento.gravarArquivoBinario((alunos));
    }

    public static void lerAlunos(){
        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos = Empacotamento.lerArquivoBinario();
        for(int i=0; i<alunos.size(); i++){
            System.out.println(alunos.get(i).toString());
            System.out.println(alunos.get(i).aferirAvaliacao());
        }
    }
}
