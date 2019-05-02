package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Alunoinf_2 on 24/04/2019.
 */

@Entity
public class Veiculo implements Serializable{
    @Id
    @GeneratedValue
    private Long id;
    private String marca;
    private String modelo;
    private Integer AnoFabricacao;
    private Integer AnoModelo;
    private Integer PotenciaMotor;

    public Veiculo(Long id, String marca, String modelo, Integer anoFabricacao, Integer anoModelo, Integer potenciaMotor) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        AnoFabricacao = anoFabricacao;
        AnoModelo = anoModelo;
        PotenciaMotor = potenciaMotor;
    }

    public Veiculo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnoFabricacao() {
        return AnoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        AnoFabricacao = anoFabricacao;
    }

    public Integer getAnoModelo() {
        return AnoModelo;
    }

    public void setAnoModelo(Integer anoModelo) {
        AnoModelo = anoModelo;
    }

    public Integer getPotenciaMotor() {
        return PotenciaMotor;
    }

    public void setPotenciaMotor(Integer potenciaMotor) {
        PotenciaMotor = potenciaMotor;
    }
}