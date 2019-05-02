import model.Veiculo;
import org.apache.log4j.Logger;
import org.h2.tools.Server;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import persistencia.VeiculoRepository;
import persistencia.VeiculoRepositoryImpl;

import java.sql.SQLException;

public class PersisteVeiculoTeste {
    Logger logger = Logger.getLogger(PersisteVeiculoTeste.class.getName());

    Server server = null;
    VeiculoRepository repository;

    @BeforeTest
    public void setup() throws SQLException {
        server = Server.createTcpServer().start();
        repository = new VeiculoRepositoryImpl();
    }

    @Test
    public void TestaPersistenciaVeiculo(){
        Veiculo veiculo = new Veiculo();
        veiculo.setMarca("Ford");
        veiculo.setAnoFabricacao(99);
        veiculo.setAnoModelo(99);
        veiculo.setPotenciaMotor(4000);
        veiculo.setModelo("Nascar");
        // Create veiculo
        Veiculo novoVeiculo = repository.create(veiculo);
        System.out.println("Id do veiculo: " + novoVeiculo.getId());
        Assert.assertTrue(veiculo != null);
    }
}
