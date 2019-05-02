import model.Veiculo;
import org.apache.log4j.Logger;
import org.h2.tools.Server;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import persistencia.VeiculoRepository;
import persistencia.VeiculoRepositoryImpl;

import java.sql.SQLException;

public class AlteraVeiculoTeste {

    Logger logger = Logger.getLogger(AlteraVeiculoTeste.class.getName());

    Server server = null;
    VeiculoRepository repository = null;

    @BeforeTest
    public void setup() throws SQLException {
        server = Server.createTcpServer().start();
        repository = new VeiculoRepositoryImpl();
    }

    @Test
    public void alteraNomeTeste(){
        Veiculo veiculo = repository.read(1L);
        if(veiculo != null){

        }
        veiculo.setAnoFabricacao(87);
        veiculo.setMarca("Volkswagen");
        //update person record
        repository.update(veiculo);

        System.out.println("Marca do veiculo: " + veiculo.getMarca());

        Assert.assertTrue(veiculo.getMarca().equals("Volkswagen"));
    }
}
