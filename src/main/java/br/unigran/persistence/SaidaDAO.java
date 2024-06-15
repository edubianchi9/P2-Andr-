package br.unigran.persistence;

import br.unigran.entidades.Saida;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaidaDAO {
    private EntityManager entityManager;

    public SaidaDAO() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistenceTask");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public void salvar(Saida saida) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(saida);
        transaction.commit();
    }

    public Saida buscarPorId(Long id) {
        return entityManager.find(Saida.class, id);
    }

    public void atualizar(Saida saida) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(saida);
        transaction.commit();
    }

    public void excluir(Long id) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Saida saida = entityManager.find(Saida.class, id);
        entityManager.remove(saida);
        transaction.commit();
    }

    public void fechar() {
        entityManager.close();
    }
}

