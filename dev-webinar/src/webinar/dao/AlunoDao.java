package webinar.dao;

import java.util.List;
import java.util.function.Consumer;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import webinar.model.Aluno;

public class AlunoDao implements Dao<Aluno> {

	private EntityManager em;

	public AlunoDao() {
		em = JPAUtil.getEntityManagerFactory().createEntityManager();
	}
	
	@Override
	public Aluno get(int id) {
		return em.find(Aluno.class, id);
	}

	@Override
	public List<Aluno> getAll() {
		// TypedQuery
		return em.createQuery("FROM Aluno", Aluno.class).getResultList();
	}

	@Override
	public void save(Aluno instance) {
		executeInsideTransaction(em -> em.persist(instance));

	}

	@Override
	public void update(Aluno instance) {
		executeInsideTransaction(em -> em.merge(instance));

	}

	@Override
	public void delete(Aluno instance) {
		executeInsideTransaction(em -> em.remove(instance));

	}

	private void executeInsideTransaction(Consumer<EntityManager> action) {
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			action.accept(em);
			tx.commit();
		} catch (RuntimeException e) {
			tx.rollback();
			throw e;
		}
	}

}
