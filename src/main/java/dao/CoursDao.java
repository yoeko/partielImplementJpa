package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import domaine.Cours;

public class CoursDao {
	
	// 1. Ouverture unité de travail JPA
	public EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-mappingheritage");
	public EntityManager em = emf.createEntityManager();
	
	public void createCours(Cours cours) {
		
		//	Ouverture de la transaction
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		//	Persistence
		em.persist(cours);
		//	Fermeture de la transaction
		tx.commit();
		//	Fermeture unité de travail
		em.close();
		emf.close();
		
	}
	
	public void getCours() {
		
	}
	
	public void getAllCours() {
		
	}
	
	public void updateCours() {
		
	}
	
	public void deleteCours() {
		
	}

}
