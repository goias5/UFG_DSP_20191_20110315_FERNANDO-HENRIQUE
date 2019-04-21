package persistencia.exclusao;

import persistencia.criacao.InicializadorDoBancoDeDados;

import java.sql.SQLException;
import java.sql.Statement;

public class Deletor {
    Statement statement;

    public Deletor() throws Exception {
        InicializadorDoBancoDeDados inicializadorDoBancoDeDados = new InicializadorDoBancoDeDados();
        this.statement = inicializadorDoBancoDeDados.getStatement();
    }

    public void deletaCargo(int id) throws Exception {
        this.statement.execute("DELETE FROM Cargo WHERE id = "+id+";");
    }

    public void deletaDepartamento(int id) throws Exception {
        this.statement.execute("DELETE FROM Departamento WHERE id = "+id+";");
    }

    public void deletaFuncionario(int id) throws Exception {
        this.statement.execute("DELETE FROM Funcionario WHERE id = "+id+";");
    }

    public void deletaLotacao(int id) throws Exception {
        this.statement.execute("DELETE FROM Lotacao WHERE id = "+id+";");
    }

    public void deletaTodosCargos() throws SQLException {
        this.statement.execute("DELETE FROM Cargo;");
    }

    public void deletaTodosDepartamentos() throws SQLException {
        this.statement.execute("DELETE FROM Departamento;");
    }

    public void deletaTodosFuncionarios() throws SQLException {
        this.statement.execute("DELETE FROM Funcionario;");
    }

    public void deletaTodasLotacoes() throws SQLException {
        this.statement.execute("DELETE FROM Lotacao;");
    }
}
