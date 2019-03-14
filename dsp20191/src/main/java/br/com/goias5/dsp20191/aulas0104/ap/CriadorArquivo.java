package br.com.goias5.dsp20191.aulas0104.ap;

import java.io.File;
import java.io.IOException;

/**
 * Created by aluno on 13/03/19.
 */
public class CriadorArquivo {
    private File arquivo;
    private String nomeArquivo;

    public File getArquivo() {
        return arquivo;
    }

    private void nomeiaArquivo(){
        String nome = "src/main/resources/arquivoTeste.txt";
        this.nomeArquivo = nome;
    }

    public CriadorArquivo() throws IOException {
        nomeiaArquivo();
        this.arquivo = new File(nomeArquivo);
        if(!arquivo.exists()){
            this.arquivo.createNewFile();
        }
    }
}
