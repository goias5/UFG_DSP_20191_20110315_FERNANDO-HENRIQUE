package persistencia.criacao;

import persistencia.utilitarios.LeitorArquivoSQL;
import persistencia.conexao.CriaConexao;

import java.sql.Connection;
import java.sql.Statement;

public class InicializadorDoBancoDeDados {
    private Connection connection;
    private Statement statement;

    public InicializadorDoBancoDeDados() throws Exception {
        CriaConexao criaConexao = new CriaConexao();
        this.connection = criaConexao.getConnection("file");
        this.statement = connection.createStatement();
    }

    public Connection getConnection() {
        return connection;
    }

    public Statement getStatement() {
        return statement;
    }

    public void criaTabelas() {
        try {
            this.statement.execute(LeitorArquivoSQL.sqlFileToString("src/main/resources/cria_tabelas.sql"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   public void inserirDadosFicticios() {
       try {
           this.statement.execute(LeitorArquivoSQL.sqlFileToString("src/main/resources/insere_dados_ficticios_iniciais.sql"));
       } catch (Exception e) {
           e.printStackTrace();
       }
   }

   public void alteraTabelaLotacao(){
       try {
           this.statement.execute(LeitorArquivoSQL.sqlFileToString("src/main/resources/alter_table_lotacao.sql"));
       } catch (Exception e) {
           e.printStackTrace();
       }
   }

}
