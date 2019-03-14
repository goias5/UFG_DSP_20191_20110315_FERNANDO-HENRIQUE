import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by aluno on 13/03/19.
 */
public class EscreveArquivo {

    public static void escreveNoArquivo(File arquivo) throws IOException {
        FileWriter fileWriter = new FileWriter(arquivo);
        fileWriter.write("Estou escrevendo no arquivo para testar!");
        fileWriter.close();
    }
}
