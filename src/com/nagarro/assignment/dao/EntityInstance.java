package com.nagarro.assignment.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityInstance {
	private EntityManager em;
	public EntityManager getEntityManager() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		em = emf.createEntityManager();
		return em;
	}

}
