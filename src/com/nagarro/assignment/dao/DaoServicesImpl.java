package com.nagarro.assignment.dao;

import javax.persistence.EntityManager;

import org.springframework.transaction.annotation.Transactional;

import com.nagarro.assignment.model.FlightUser;

public class DaoServicesImpl {
	//private AppConfig config;
	private EntityInstance em = new EntityInstance();
	@Transactional
	public void insertUser(FlightUser user) {
		//em=config.getEntity();
		EntityManager emo=em.getEntityManager();
		emo.getTransaction().begin();
		emo.persist(user);
		emo.getTransaction().commit();
		System.out.println("object saved sucessfully");
	
	}
	
	

}
