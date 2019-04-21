package persistencia.alteracao;

import model.Cargo;
import persistencia.criacao.InicializadorDoBancoDeDados;
import persistencia.pesquisa.Pesquisador;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Alterador {
    Statement statement;

    public Alterador() throws Exception {
        InicializadorDoBancoDeDados inicializadorDoBancoDeDados = new InicializadorDoBancoDeDados();
        this.statement = inicializadorDoBancoDeDados.getStatement();
    }

    public void alteraNomeCargo(int id, String novoNome) throws Exception {
        this.statement.execute("UPDATE Cargo SET nome = '"+novoNome+"' WHERE id = "+id+";");
    }

    public void alteraSalarioCargo(int id, double novoSalario) throws Exception {
        this.statement.execute("UPDATE Cargo SET salario = "+novoSalario+" WHERE id = "+id+";");
    }

    public void alteraNomeDepartamento(int id, String novoNome) throws Exception {
        this.statement.execute("UPDATE Departamento SET nome = '"+novoNome+"' WHERE id = "+id+";");
    }

    public void alteraNomeFuncionario(int id, String novoNome) throws Exception {
        this.statement.execute("UPDATE Funcionario SET nome = '"+novoNome+"' WHERE id = "+id+";");
    }

    public void alteraMatriculaFuncionario(int id, int novaMatricula) throws Exception {
        this.statement.execute("UPDATE Funcionario SET matricula = "+novaMatricula+" WHERE id = "+id+";");
    }

    public void alteraDataInicialLotacao(int id, Date novaDataInicial) throws Exception {
        this.statement.execute("UPDATE Lotacao SET dataInicial = "+novaDataInicial+" WHERE id = "+id+";");
    }

    public void alteraDataFinalLotacao(int id, Date novaDataFinal) throws Exception {
        this.statement.execute("UPDATE Lotacao SET dataFinal = "+novaDataFinal+" WHERE id = "+id+";");
    }

    public void alteraCargoIDLotacao(int id, int novoCargoID) throws Exception {
        this.statement.execute("UPDATE Lotacao SET cargoID = "+novoCargoID+" WHERE id = "+id+";");
    }

    public void alteraDepartamentoIDLotacao(int id, int novoDepartamentoID) throws Exception {
        this.statement.execute("UPDATE Lotacao SET cargoID = "+novoDepartamentoID+" WHERE id = "+id+";");
    }

    public void alteraFuncionarioIDLotacao(int id, int novoFuncionarioID) throws Exception {
        this.statement.execute("UPDATE Lotacao SET cargoID = "+novoFuncionarioID+" WHERE id = "+id+";");
    }

    public void alteraSalarioCargoDepartamento(String nomeCargo, String nomeDepartamento, double novoSalario) throws Exception {
        Pesquisador pesquisador = new Pesquisador();
        int idCargo = pesquisador.pesquisaCargoPorNome(nomeCargo);
        int idDepartamento = pesquisador.pesquisaDepartamentoPorNome(nomeDepartamento);
        ResultSet resultSet = this.statement.executeQuery("SELECT * FROM Lotacao WHERE cargoID = "+
                idCargo+" AND departamentoID = "+idDepartamento+";");
        if(resultSet.next()){
            this.statement.execute("UPDATE Cargo SET salario = "+novoSalario+" WHERE id = "+idCargo+";");
            resultSet = this.statement.executeQuery("SELECT * FROM Lotacao WHERE cargoID = "+idCargo+";");
            System.out.println("Os funcionarios que tiveram seu salário alterado foram: ");
            while(resultSet.next()){
                System.out.println(pesquisador.pesquisaFuncionarioPorID(resultSet.getInt("funcionarioID")));
            }
        }
        else{
            System.out.println("Nenhum funcionario teve seu salário alterado");
        }
    }

}