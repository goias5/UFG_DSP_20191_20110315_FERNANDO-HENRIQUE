import org.dom4j.DocumentException;

import java.io.IOException;

/**
 * Created by aluno on 02/04/19.
 */
public class Main {
    public static void main(String args[]) throws DocumentException, IOException {
        XMLFileManager xmlFileManager = new XMLFileManager("src/main/resources/students.xml");
        //xmlFileManager.lerArquivoXML();
        //xmlFileManager.gerarArquivoContendoDadosDoArquivoXML();
        xmlFileManager.alterarFrequenciaNaAula0104(false);
    }
}
