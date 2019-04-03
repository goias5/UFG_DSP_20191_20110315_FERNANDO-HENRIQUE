import java.io.*;

/**
 * Created by Alunoinf_2 on 21/03/2019.
 */
public class GerenciadorDados {

    public static void gravarAlunoArquivo(Aluno aluno) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/avaliacao.dat",true);
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        dataOutputStream.writeUTF(aluno.getNome());
        dataOutputStream.writeLong(aluno.getMatricula());
        dataOutputStream.writeDouble(aluno.getNota1());
        dataOutputStream.writeDouble(aluno.getNota2());
        dataOutputStream.close();
        fileOutputStream.close();
    }

    public static void lerAlunoArquivo() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src/main/resources/avaliacao.dat");
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        for(int i=0; i<4; i++){
            Aluno aluno = new Aluno(dataInputStream.readUTF(), dataInputStream.readLong(), dataInputStream.readDouble(), dataInputStream.readDouble());
            System.out.print(aluno.toString());
            if((aluno.getNota1()+aluno.getNota2()/2)>5){
                System.out.println("   APROVADO");
            }
            else{
                System.out.println("   REPROVADO");
            }
        }
        dataInputStream.close();
        fileInputStream.close();
    }
}
