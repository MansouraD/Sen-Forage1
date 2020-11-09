package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.beans.Villages;

public class VillageDAO implements VillageLOCAL {
	@PersistenceContext(unitName="senbase")
	private EntityManager em;
	
	@Override
	public List<Villages> liste() {
		
		return em.createQuery("SELECT p FROM Villages p").getResultList();
	}

	@Override
	public int add(Villages Villages) {
		int yes = 0 ;
		try {
			em.getTransaction().begin();
			em.persist(Villages);
			em.getTransaction().commit();
			yes = 1 ;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return yes;
	}

}
