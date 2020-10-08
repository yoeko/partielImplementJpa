package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import domaine.User;

public class UserDao {

	
	
	public void createUser(User user) {
		
		// Ouverture unité de travail JPA
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("partiel");
		EntityManager em = emf.createEntityManager();
		
		// Ouverture de la transaction		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		//	Persistence Objet Relationnel : création d'un enregistrement en base
		em.persist(user);
		
		// Fermeture transaction
		tx.commit();
		
		//	Fermeture unité de travail
		em.close();
		emf.close();
	}
	
}
