package br.unigran.persistence;

import br.unigran.entidades.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ProdutoDAO {
    private EntityManager entityManager;

    public ProdutoDAO() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistenceTask");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public void salvar(Produto produto) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(produto);
        transaction.commit();
    }

    public Produto buscarPorId(Long id) {
        return entityManager.find(Produto.class, id);
    }

    public void atualizar(Produto produto) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(produto);
        transaction.commit();
    }

    public void excluir(Long id) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Produto produto = entityManager.find(Produto.class, id);
        entityManager.remove(produto);
        transaction.commit();
    }

    public void fechar() {
        entityManager.close();
    }
}

