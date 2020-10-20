package webinar.dao;

import java.util.List;
import java.util.function.Consumer;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import webinar.model.Formacao;
import webinar.model.Instrutor;

public class InstrutorDao implements Dao<Instrutor> {

	private EntityManager em;
	
	public InstrutorDao() {
		em = JPAUtil.getEntityManagerFactory().createEntityManager();
	}

	@Override
	public Instrutor get(int id) {
		return em.find(Instrutor.class, id);
	}

	@Override
	public List<Instrutor> getAll() {
		// TypedQuery
		return em.createQuery("FROM Instrutor", Instrutor.class).getResultList();
	}
	
	public List<Instrutor> getAllbyFormacao(Formacao pformacao){
		Query q = em.createQuery("Select i from Instrutor i Where i.formacao = :pformacao");
		q.setParameter("pformacao", pformacao);
		return q.getResultList();
	}

	@Override
	public void save(Instrutor instance) {
		executeInsideTransaction(em -> em.persist(instance));

	}

	@Override
	public void update(Instrutor instance) {
		executeInsideTransaction(em -> em.merge(instance));

	}

	@Override
	public void delete(Instrutor instance) {
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
