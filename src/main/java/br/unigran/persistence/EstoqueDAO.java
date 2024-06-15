package br.unigran.persistence;

import br.unigran.entidades.Estoque;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EstoqueDAO {
    private EntityManager entityManager;

    public EstoqueDAO() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistenceTask");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public void salvar(Estoque estoque) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(estoque);
        transaction.commit();
    }

    public Estoque buscarPorId(Long id) {
        return entityManager.find(Estoque.class, id);
    }

    public void atualizar(int estoque) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(estoque);
        transaction.commit();
    }

    public void excluir(Long id) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Estoque estoque = entityManager.find(Estoque.class, id);
        entityManager.remove(estoque);
        transaction.commit();
    }

    public void fechar() {
        entityManager.close();
    }
}

