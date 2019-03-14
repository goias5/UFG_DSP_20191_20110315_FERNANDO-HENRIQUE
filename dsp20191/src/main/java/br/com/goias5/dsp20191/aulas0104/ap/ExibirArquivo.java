package br.com.goias5.dsp20191.aulas0104.ap;

import java.io.*;

/**
 * Created by aluno on 13/03/19.
 */
public class ExibirArquivo {

    public static void exibeArquivo(File arquivo) throws IOException {
        BufferedReader buffer = new BufferedReader(new FileReader(arquivo));
        while(buffer.ready()){
            String linha = buffer.readLine();
            System.out.println(linha);
        }
        buffer.close();
    }
}
