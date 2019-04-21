package model;

import persistencia.alteracao.Alterador;
import persistencia.pesquisa.Pesquisador;

public class Main {

    public static void main(String args[]) throws Exception {
        Alterador alterador = new Alterador();
        alterador.alteraSalarioCargoDepartamento("Pedreiro","Administrativo",3400.00);
    }
}
