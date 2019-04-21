package persistencia.pesquisa;

import persistencia.criacao.InicializadorDoBancoDeDados;

import java.sql.ResultSet;
import java.sql.Statement;

public class Pesquisador {
    Statement statement;

    public Pesquisador() throws Exception {
        InicializadorDoBancoDeDados inicializadorDoBancoDeDados = new InicializadorDoBancoDeDados();
        this.statement = inicializadorDoBancoDeDados.getStatement();
    }

    public int pesquisaCargoPorNome(String nome) throws Exception {
        ResultSet resultSet = this.statement.executeQuery("Select id FROM Cargo WHERE nome = '"+nome+"';");
        resultSet.next();
        return resultSet.getInt("id");
    }

    public int pesquisaDepartamentoPorNome(String nome) throws Exception {
        ResultSet resultSet = this.statement.executeQuery("Select id FROM Departamento WHERE nome = '"+nome+"';");
        resultSet.next();
        return resultSet.getInt("id");
    }

    public int pesquisaFuncionarioPorNome(String nome) throws Exception {
        ResultSet resultSet = this.statement.executeQuery("Select id FROM Funcionario WHERE nome = '"+nome+"';");
        resultSet.next();
        return resultSet.getInt("id");
    }

    public String pesquisaFuncionarioPorID (int id) throws Exception {
        ResultSet resultSet = this.statement.executeQuery("Select nome FROM Funcionario WHERE id = "+id+";");
        resultSet.next();
        return resultSet.getString("nome");
    }

    public int pesquisaFuncionarioPorMatricula(int matricula) throws Exception {
        ResultSet resultSet = this.statement.executeQuery("Select id FROM Funcionario WHERE matricula = "+matricula+";");
        resultSet.next();
        return resultSet.getInt("id");
    }

    public int pesquisaLotacaoPorIDsCargoDepartamentoFuncionario(int idCargo, int idDepartamento, int idFuncionario) throws Exception {
        ResultSet resultSet = this.statement.executeQuery("Select id FROM Lotacao WHERE cargoID = "+idCargo+
                " AND departamentoID = "+idDepartamento+" AND funcionarioID = " + idFuncionario +";");
        resultSet.next();
        return resultSet.getInt("id");
    }
}
