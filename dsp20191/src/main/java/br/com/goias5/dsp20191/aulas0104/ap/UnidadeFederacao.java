package br.com.goias5.dsp20191.aulas0104.ap;

/**
 * Created by aluno on 15/03/19.
 */
public class UnidadeFederacao {
    private String numero;
    private String sigla;
    private String nome;
    private String regiao;

    public UnidadeFederacao(String linha){
        String[] dadosSeparados = linha.split(",");
//        for (int i=0; i<dadosSeparados.length; i++){
//            System.out.print(dadosSeparados[i]);
//            System.out.print(" ");
//        }
        this.numero = dadosSeparados[0];
        this.sigla = dadosSeparados[1];
        this.nome = dadosSeparados[2];
        this.regiao = dadosSeparados[3];

    }

    @Override
    public String toString() {
        return "UnidadeFederacao{" +
                "numero=" + numero +
                ", sigla='" + sigla + '\'' +
                ", nome='" + nome + '\'' +
                ", regiao=" + regiao +
                '}';
    }
}
