import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class XMLFileManager {
    private String caminhoArquivoXML;
    private SAXReader saxReader;
    private File arquivoXML;
    private Document document;
    private Element classElement;

    public XMLFileManager() throws DocumentException {
        this.caminhoArquivoXML = "src/main/resources/students.xml";
        this.saxReader = new SAXReader();
        this.arquivoXML = new File(caminhoArquivoXML);
        this.saxReader.read(this.caminhoArquivoXML);
        this.document = saxReader.read(arquivoXML);
        this.classElement = document.getRootElement();
    }

    public String lerArquivoXML() {
        List<Node> nodes = this.document.selectNodes("/class/student" );
        String leitura = ("----------------------------\n");
        for (Node node : nodes) {
            leitura = leitura.concat("\n\nCurrent Element :"
                    + node.getName());
            leitura = leitura.concat("\nMatrícula : "
                    + node.selectSingleNode("matricula").getText());
            leitura = leitura.concat("\nFirst Name : "
                    + node.selectSingleNode("firstname").getText());
            leitura = leitura.concat("\nLast Name : "
                    + node.selectSingleNode("lastname").getText());
            leitura = leitura.concat("\nFirst Name : "
                    + node.selectSingleNode("nickname").getText());
            List<Node> nodesFrequencia = node.selectSingleNode("frequencia").selectNodes("aulas");
            leitura = leitura.concat("\nFrequência: ");
            for (Node nodesDaFrequencia : nodesFrequencia) {
                leitura = leitura.concat("\n\tAulas numero : "
                        + nodesDaFrequencia.valueOf("@numero"));
                leitura = leitura.concat("\n\t\tPresença:  "
                        + nodesDaFrequencia.getText());
            }
        }
        return leitura;
    }

    public void imprimeNaTelaDadosDoArquivoXML(){
        System.out.println(lerArquivoXML());
    }

    public void gerarArquivoContendoDadosDoArquivoXML() throws IOException {
        File file = new File("src/main/resources/dadosDoArquivoStudentsXML.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter( fileWriter );
        String dados = lerArquivoXML();
        bufferedWriter.write(dados);
        bufferedWriter.close();
        fileWriter.close();
    }


    public void alterarFrequenciaNaAula0104 () throws IOException {
        List<Node> nodes = this.document.selectNodes("/class/student" );
        for (Node node : nodes) {
            if (node.selectSingleNode("matricula").getText().equals("201100315")) {
                List<Node> nodesFrequencia = node.selectSingleNode("frequencia").selectNodes("aulas");
                for (Node nodesDaFrequencia : nodesFrequencia) {
                    if (nodesDaFrequencia.valueOf("@numero").equals("0104")) {
                        Element elementoAMudar = (Element) nodesDaFrequencia;
                        if (elementoAMudar.getText().equals("F")) {
                            elementoAMudar.setText("P");
                        } else {
                            elementoAMudar.setText("F");
                        }
                        escreveODocumento();
                    }
                }
            }
        }
    }

    public void escreveODocumento() throws IOException {
        OutputFormat format = OutputFormat.createPrettyPrint();
        XMLWriter writer;
        writer = new XMLWriter(new FileWriter(arquivoXML),format);
        writer.write( document );
        writer.close();
    }
}
