package persistencia;

import model.Veiculo;

import java.util.List;

public interface VeiculoRepository {

    /**
     * Create a new Veiculo
     *
     * @param veiculo
     * @return Veiculo
     */
    Veiculo create(Veiculo veiculo);

    /**
     * Read Person by id
     *
     * @param id
     * @return Veiculo
     */
    Veiculo read(Long id);

    /**
     * @param marca
     * @return
     */
    List<Veiculo> findByName(String marca);

    /**
     * Update veiculo
     *
     * @param veiculo
     */
    Veiculo update(Veiculo veiculo);

    /**
     * Delete veiculo
     *
     * @param veiculo
     */
    void delete(Veiculo veiculo);

    /**
     * close the model manager factory
     */
    void close();
}
