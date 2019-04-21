package persistencia.bancoDeDados;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class LeitorArquivoSQL {
    public static String sqlFileToString(String caminhoArquivoSQL) throws IOException {
        File file = new File(caminhoArquivoSQL);
        FileInputStream fileInputStream = new FileInputStream(file);
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        byte[] byteVector = new byte[(int)file.length()];
        dataInputStream.readFully(byteVector);
        dataInputStream.close();
        fileInputStream.close();
        String text = new String(byteVector);
        return text;
    }
}
