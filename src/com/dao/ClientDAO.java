package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.beans.Clients;

public class ClientDAO implements ClientLOCAL {
	
	@PersistenceContext(unitName="senbase")
	private EntityManager em;
	
	@Override
	public List<Clients> liste() {
		return em.createQuery("SELECT p FROM Clients p").getResultList();
	}

	@Override
	public int add(Clients Clients) {

		int yes = 0 ;
		try {
			em.getTransaction().begin();
			em.persist(Clients);
			em.getTransaction().commit();
			yes = 1 ;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return yes;
	}


}
