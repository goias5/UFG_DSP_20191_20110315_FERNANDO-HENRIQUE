package persistencia.criacao;

import persistencia.bancoDeDados.LeitorArquivoSQL;
import persistencia.conexao.CriaConexao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InicializadorDoBancoDeDados {
    private Connection connection;
    private Statement statement;

    public InicializadorDoBancoDeDados() throws Exception {
        CriaConexao criaConexao = new CriaConexao();
        this.connection = criaConexao.getConnection("file");
        this.statement = connection.createStatement();
    }

    public void criaTabelas() throws SQLException, IOException {
        this.statement.execute(LeitorArquivoSQL.sqlFileToString("src/main/resources/criaTabelas.sql"));
   }

   public void inserirDadosFicticios() throws IOException, SQLException {
        this.statement.execute(LeitorArquivoSQL.sqlFileToString("src/main/resources/insereDadosFicticiosIniciais.sql"));
   }

}
