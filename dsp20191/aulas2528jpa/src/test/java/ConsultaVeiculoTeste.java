import model.Veiculo;
import org.apache.log4j.Logger;
import org.h2.tools.Server;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import persistencia.VeiculoRepository;
import persistencia.VeiculoRepositoryImpl;

import java.sql.SQLException;

public class ConsultaVeiculoTeste {
    Logger logger = Logger.getLogger(ConsultaVeiculoTeste.class.getName());

    VeiculoRepository repository;

    Server server;

    @BeforeTest
    public void setup() throws SQLException {
        server = Server.createTcpServer().start();
        repository = new VeiculoRepositoryImpl();
    }

    @Test
    public void consultaPeloIdTeste(){
        Veiculo veiculo = repository.read(1L);
        System.out.println("Marca do Veiculo: " + veiculo.getMarca());
        Assert.assertTrue(veiculo != null);
    }
}
