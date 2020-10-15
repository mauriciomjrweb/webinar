package webinar.app;

import javax.persistence.EntityManager;

import webinar.dao.JPAUtil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		JPAUtil.shutdown();

	}

}
