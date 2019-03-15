package br.com.goias5.dsp20191.aulas0104.ap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by aluno on 15/03/19.
 */
public class LeitorArquivoCSV {

    public static ArrayList<UnidadeFederacao> leArquivoCSV () throws IOException {
        ArrayList<UnidadeFederacao> unidadesDaFederacao = new ArrayList<UnidadeFederacao>();
        BufferedReader buffer = new BufferedReader(new FileReader("src/main/resources/UF.csv"));
        int numeroLinha = 1;
        while(buffer.ready()){
            if(numeroLinha==1){
                buffer.readLine();
                numeroLinha++;
                continue;
            }
            String linha = buffer.readLine();
            numeroLinha++;
            if(numeroLinha<30) {
                UnidadeFederacao unidadeFederacao = new UnidadeFederacao(linha);
                unidadesDaFederacao.add(unidadeFederacao);
            }
        }
        buffer.close();
        return unidadesDaFederacao;
    }
}
