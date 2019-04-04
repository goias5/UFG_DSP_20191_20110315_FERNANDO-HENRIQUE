import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.nio.file.Path;

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

    public static <T> void toJSON(String caminhoArquivo, T objeto) throws IOException {
        Gson gson = new Gson();
        String json = gson.toJson(objeto);
        File file = new File(caminhoArquivo);
        file.createNewFile();
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(json);
        fileWriter.close();
    }


    public void gerarArquivoContendoDadosDoArquivoJson() throws IOException {
        StudentsClass student = fromJSON(textFileInString, StudentsClass.class);
        File file = new File("src/main/resources/dadosDoArquivoStudentsJSON.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter( fileWriter );
        bufferedWriter.write(student.toString());
        bufferedWriter.close();
        fileWriter.close();
    }

    public void alterarFrequenciaNaAula0104() throws IOException {
        StudentsClass student = fromJSON(textFileInString, StudentsClass.class);
        alteraAFrequenciaNoObjetoStudent(student);
        toJSON(arquivoJson.getAbsolutePath(), student);
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

    private void alteraAFrequenciaNoObjetoStudent(StudentsClass student){
        for(int i=0; i<student.getStudents().getStudent().size(); i++){
            if(student.getStudents().getStudent().get(i).getMatricula().equals("201100315")){
                for(int j=0; j<student.getStudents().getStudent().get(i).getFrequencia().getAulas().size(); j++){
                    if(student.getStudents().getStudent().get(i).getFrequencia().getAulas().get(j).getNumero().equals("0104")){
                        if(student.getStudents().getStudent().get(i).getFrequencia().getAulas().get(j).getFrequencia().equals("P")){
                            student.getStudents().getStudent().get(i).getFrequencia().getAulas().get(j).setFrequencia("F");
                        }
                        else{
                            student.getStudents().getStudent().get(i).getFrequencia().getAulas().get(j).setFrequencia("P");
                        }
                    }
                }
            }
        }
    }
}
