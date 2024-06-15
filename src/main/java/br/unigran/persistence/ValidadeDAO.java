package br.unigran.persistence;

import br.unigran.entidades.Validade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ValidadeDAO {
    private EntityManager entityManager;

    public ValidadeDAO() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistenceTask");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public void salvar(Validade validade) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(validade);
        transaction.commit();
    }

    public Validade buscarPorId(Long id) {
        return entityManager.find(Validade.class, id);
    }

    public void atualizar(Validade validade) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(validade);
        transaction.commit();
    }

    public void excluir(Long id) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Validade validade = entityManager.find(Validade.class, id);
        entityManager.remove(validade);
        transaction.commit();
    }

    public void fechar() {
        entityManager.close();
    }
}

