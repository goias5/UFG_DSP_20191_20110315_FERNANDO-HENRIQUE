package persistencia;

import model.Cargo;
import model.Departamento;
import model.Funcionario;

public class InstanciasParaExemplo {
    private static final Funcionario funcionario1 = new Funcionario(1,"Jose Arantes",1);
    private static final Funcionario funcionario2 = new Funcionario(2,"Lucas Silveira",2);
    private static final Funcionario funcionario3 = new Funcionario(3,"Manoel",3);
    private static final Funcionario funcionario4 = new Funcionario(4,"Jorge",4);
    private static final Funcionario funcionario5 = new Funcionario(5,"Fernando",5);
    private static final Funcionario funcionario6 = new Funcionario(6,"Raquel",6);
    private static final Funcionario funcionario7 = new Funcionario(7,"Lucia",7);
    private static final Funcionario funcionario8 = new Funcionario(8,"Laura",8);
    private static final Funcionario funcionario9 = new Funcionario(9,"Larissa",9);
    private static final Funcionario funcionario510 = new Funcionario(10,"Daniela",10);

    private static final Cargo pedreiro = new Cargo(1,"Pedreiro",1250.00);
    private static final Cargo faxineiro = new Cargo(1,"Faxineiro",1150.00);
    private static final Cargo gerente = new Cargo(1,"Gerente",2225.00);

    private static final Departamento departamento1 = new Departamento(1,"Recursos Humanos");
    private static final Departamento departamento2 = new Departamento(1,"Administrativo");
    private static final Departamento departamento3 = new Departamento(1,"Financeiro");
    private static final Departamento departamento4 = new Departamento(1,"Presidencia");

}
