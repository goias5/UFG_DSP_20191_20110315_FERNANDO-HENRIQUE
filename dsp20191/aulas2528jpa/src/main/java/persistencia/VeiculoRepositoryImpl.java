package persistencia;

import model.Veiculo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Alunoinf_2 on 24/04/2019.
 */
public class VeiculoRepositoryImpl implements  VeiculoRepository{
    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aula2528jpa");
    private EntityManager entityManager;

    public VeiculoRepositoryImpl() {
        entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    public Veiculo create(Veiculo veiculo){
        entityManager.getTransaction().begin();
        entityManager.persist(veiculo);
        entityManager.getTransaction().commit();
        return veiculo;
    }

    @Override
    public Veiculo read(Long id){
        entityManager.getTransaction().begin();
        Veiculo veiculo = entityManager.find(Veiculo.class, id);
        entityManager.getTransaction().commit();
        return veiculo;
    }

    @Override
    public List<Veiculo> findByName(String marca){
        Query query = entityManager.createQuery("Select v from model.Veiculo v where v.marca like :marca"+marca);
        query.setParameter("marca", marca);
        return query.getResultList();
    }

    @Override
    public Veiculo update(Veiculo veiculo){
        entityManager.getTransaction().begin();
        veiculo = entityManager.merge(veiculo);
        entityManager.getTransaction().commit();
        return veiculo;
    }

    @Override
    public void delete(Veiculo veiculo) {
        entityManager.getTransaction().begin();
        entityManager.remove(veiculo);
        entityManager.getTransaction().commit();
    }

    @Override
    public void close(){
        entityManager.close();
    }
}

