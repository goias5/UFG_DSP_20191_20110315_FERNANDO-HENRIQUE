import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;

/**
 * Created by aluno on 02/04/19.
 */
public class JsonFileManager {
    private String localDoArquivoJson;
    private File arquivoJson;
    private Path pathArquivoJson;
    private String textFileInString;

    public JsonFileManager() throws IOException {
        this.localDoArquivoJson = "src/main/resources/students.json";
        this.textFileInString = textFileToString();
    }

    public void imprimeNaTelaDadosDoArquivoJson(){
        System.out.println(this.textFileInString);
    }

    public static <T> T fromJSON(String jsonString, Class<T> classe) throws IOException {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        T object = gson.fromJson(jsonString,classe);
        return object;
    }

    public void gerarArquivoContendoDadosDoArquivoJson() throws IOException {
        Students student = fromJSON(textFileInString, Students.class);
        System.out.println(student.getStudents().size());
        System.out.println(student.toString());
        //Todo(2) Fazer a classe ler corretamente do arquivo JSON, talvez não consegue por problema de formatação.
        //Todo(3) Aí então gravar em um arquivo texto apenas os dados do arquivo JSON, conforme pedido no exercício

    }

    public void alterarFrequenciaNaAula0104(File arquivoJson){
        //Todo(4) Deve ser feito naturalmente após a leitura do arquivo JSON ser feita coretamente.
    }

    private String textFileToString() throws IOException {
        this.arquivoJson = new File(localDoArquivoJson);
        this.pathArquivoJson = this.arquivoJson.toPath();
        File file = new File(this.pathArquivoJson.toString());
        FileInputStream fileInputStream = new FileInputStream(file);
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        byte[] byteVector = new byte[(int)file.length()];
        dataInputStream.readFully(byteVector);
        dataInputStream.close();
        fileInputStream.close();
        String text = new String(byteVector);
        //System.out.println(text);
        return text;
    }
}
