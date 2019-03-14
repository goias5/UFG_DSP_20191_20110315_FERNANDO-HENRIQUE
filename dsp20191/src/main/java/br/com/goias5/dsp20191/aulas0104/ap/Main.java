package br.com.goias5.dsp20191.aulas0104.ap;

import java.io.IOException;

/**
 * Created by aluno on 13/03/19.
 */
public class Main {
    public static void main(String args[]) throws IOException {
        System.out.println("Testando");
        CriadorArquivo criadorArquivo = new CriadorArquivo();
        EscreveArquivo.escreveNoArquivo(criadorArquivo.getArquivo());
        ExibirArquivo.exibeArquivo(criadorArquivo.getArquivo());
    }
}
