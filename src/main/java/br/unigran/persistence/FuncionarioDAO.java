package br.unigran.persistence;

import br.unigran.entidades.Funcionario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FuncionarioDAO {
    private EntityManager entityManager;

    public FuncionarioDAO() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistenceTask");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public void salvar(Funcionario funcionario) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(funcionario);
        transaction.commit();
    }

    public Funcionario buscarPorId(Long id) {
        return entityManager.find(Funcionario.class, id);
    }

    public void atualizar(Funcionario funcionario) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(funcionario);
        transaction.commit();
    }

    public void excluir(Long id) {
        Funcionario funcionario = buscarPorId(id);
        if (funcionario != null) {
            entityManager.getTransaction().begin();
            entityManager.remove(funcionario);
            entityManager.getTransaction().commit();
        }

    }
}

