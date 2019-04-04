import org.dom4j.DocumentException;

import java.io.IOException;

/**
 * Created by aluno on 02/04/19.
 */
public class Main {
    public static void main(String args[]) throws DocumentException, IOException {
        XMLFileManager xmlFileManager = new XMLFileManager();
        xmlFileManager.lerArquivoXML();
        xmlFileManager.gerarArquivoContendoDadosDoArquivoXML();
        xmlFileManager.alterarFrequenciaNaAula0104();


        JsonFileManager jsonFileManager = new JsonFileManager();
        jsonFileManager.imprimeNaTelaDadosDoArquivoJson();
        jsonFileManager.gerarArquivoContendoDadosDoArquivoJson();
        jsonFileManager.alterarFrequenciaNaAula0104();
    }
}
