package br.unigran.persistence;

import br.unigran.entidades.Entrada;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EntradaDAO {
    private EntityManager entityManager;

    public EntradaDAO() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistenceTask");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public void salvar(Entrada entrada) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(entrada);
        transaction.commit();
    }

    public Entrada buscarPorId(Long id) {
        return entityManager.find(Entrada.class, id);
    }

    public void atualizar(Entrada entrada) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(entrada);
        transaction.commit();
    }

    public void excluir(Long id) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Entrada entrada = entityManager.find(Entrada.class, id);
        entityManager.remove(entrada);
        transaction.commit();
    }

    public void fechar() {
        entityManager.close();
    }
}

