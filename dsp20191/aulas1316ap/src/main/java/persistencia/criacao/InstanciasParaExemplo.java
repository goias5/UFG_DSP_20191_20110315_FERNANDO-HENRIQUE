package persistencia.criacao;

import model.Cargo;
import model.Departamento;
import model.Funcionario;
import model.Lotacao;

import java.util.ArrayList;
import java.util.Date;

public class InstanciasParaExemplo {
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Cargo> cargos;
    private ArrayList<Departamento> departamentos;
    private ArrayList<Lotacao> lotacoes;

    private static final Funcionario funcionario1 = new Funcionario(1,"Jose Arantes",1);
    private static final Funcionario funcionario2 = new Funcionario(2,"Lucas Silveira",2);
    private static final Funcionario funcionario3 = new Funcionario(3,"Manoel",3);
    private static final Funcionario funcionario4 = new Funcionario(4,"Jorge",4);
    private static final Funcionario funcionario5 = new Funcionario(5,"Fernando",5);
    private static final Funcionario funcionario6 = new Funcionario(6,"Raquel",6);
    private static final Funcionario funcionario7 = new Funcionario(7,"Lucia",7);
    private static final Funcionario funcionario8 = new Funcionario(8,"Laura",8);
    private static final Funcionario funcionario9 = new Funcionario(9,"Larissa",9);
    private static final Funcionario funcionario10 = new Funcionario(10,"Daniela",10);

    private static final Cargo pedreiro = new Cargo(1,"Pedreiro",1250.00);
    private static final Cargo faxineiro = new Cargo(1,"Faxineiro",1150.00);
    private static final Cargo gerente = new Cargo(1,"Gerente",2225.00);

    private static final Departamento departamento1 = new Departamento(1,"Recursos Humanos");
    private static final Departamento departamento2 = new Departamento(1,"Administrativo");
    private static final Departamento departamento3 = new Departamento(1,"Financeiro");
    private static final Departamento departamento4 = new Departamento(1,"Presidencia");

    private static final Date dateForAllTests = new Date(12332131);

    private static final Lotacao lotacao1  = new Lotacao(1, dateForAllTests, dateForAllTests, pedreiro, departamento1, funcionario1);
    private static final Lotacao lotacao2  = new Lotacao(2, dateForAllTests, dateForAllTests, pedreiro, departamento2, funcionario2 );
    private static final Lotacao lotacao3  = new Lotacao(3, dateForAllTests, dateForAllTests, faxineiro, departamento3, funcionario3 );
    private static final Lotacao lotacao4  = new Lotacao(4, dateForAllTests, dateForAllTests, gerente, departamento4, funcionario4 );
    private static final Lotacao lotacao5  = new Lotacao(5, dateForAllTests, dateForAllTests, pedreiro, departamento1, funcionario5);
    private static final Lotacao lotacao6  = new Lotacao(6, dateForAllTests, dateForAllTests, pedreiro, departamento1, funcionario6);
    private static final Lotacao lotacao7  = new Lotacao(7, dateForAllTests, dateForAllTests, faxineiro, departamento2, funcionario7);
    private static final Lotacao lotacao8  = new Lotacao(8, dateForAllTests, dateForAllTests, faxineiro, departamento3, funcionario8);
    private static final Lotacao lotacao9  = new Lotacao(9, dateForAllTests, dateForAllTests, faxineiro, departamento1, funcionario9);
    private static final Lotacao lotacao10  = new Lotacao(10, dateForAllTests, dateForAllTests, pedreiro, departamento2, funcionario10);
}
