package model;

import model.Cargo;
import model.Departamento;
import model.Funcionario;

import java.util.Date;

public class Lotacao {
    private long id;
    private Date dataInicial;
    private Date dataFinal;
    private Cargo cargo;
    private Departamento departamento;
    private Funcionario funcionario;

    public Lotacao(long id, Date dataInicial, Date dataFinal, Cargo cargo, Departamento departamento, Funcionario funcionario) {
        this.id = id;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.cargo = cargo;
        this.departamento = departamento;
        this.funcionario = funcionario;
    }
}
