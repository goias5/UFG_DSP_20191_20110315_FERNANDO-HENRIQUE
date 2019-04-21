package model;

import persistencia.bancoDeDados.LeitorArquivoSQL;
import persistencia.conexao.CriaConexao;
import persistencia.criacao.InicializadorDoBancoDeDados;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

public class Main {

    public static void main(String args[]) throws Exception {
        InicializadorDoBancoDeDados inicializadorDoBancoDeDados = new InicializadorDoBancoDeDados();
        inicializadorDoBancoDeDados.criaTabelas();
        inicializadorDoBancoDeDados.inserirDadosFicticios();
    }
}
