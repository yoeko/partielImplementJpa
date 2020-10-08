package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import domaine.Etudiant;
import domaine.Personne;

public class EtudiantDao {

	
	
	public void createEtudiant(Etudiant etudiant) {
		
		// Ouverture unité de travail JPA
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("partiel");
		EntityManager em = emf.createEntityManager();
		
		// Ouverture de la transaction
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		//	Persistence Objet Relationnel : création d'un enregistrement en base
		em.persist(etudiant);
		
		// Fermeture transaction
		tx.commit();
		
		//	Fermeture unité de travail
		em.close();
		emf.close();
	}
	
	public Etudiant getEtudiant(Long id) {
		// Ouverture unité de travail JPA
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("partiel");
		EntityManager em = emf.createEntityManager();
		
		//	Récupération etudiant
		Etudiant etdt = em.find(Etudiant.class, id);
		
		em.close();
		emf.close();
		
		return etdt;
	}
	
	public void updateEtudiant(Etudiant etudiant, Etudiant nEtudiant) {
		// Ouverture unité de travail JPA
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("partiel");
		EntityManager em = emf.createEntityManager();
		
		//	Récupération etudiant
		Etudiant etdt = em.find(Etudiant.class, 1L);
		
		//	Modification de l'instance	
		etdt.setAddress(nEtudiant.getAddress());
		etdt.setCours(nEtudiant.getCours());
		etdt.setDob(nEtudiant.getDob());
		etdt.setFirst_name(nEtudiant.getFirst_name());
		etdt.setLast_name(nEtudiant.getLast_name());
		etdt.setMail(nEtudiant.getMail());
		etdt.setPhone(nEtudiant.getPhone());
		
		// Ouverture de la transaction
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		//	Persistence Objet Relationnel : création d'un enregistrement en base
		em.merge(etdt);
		
		//	Fermeture de la transaction
		tx.commit();
		
		//	Fermeture unité de travail
		em.close();
		emf.close();	
		
	}
	
	public void deleteEtudiant(Long id) {
		// Ouverture unité de travail JPA
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("partiel");
		EntityManager em = emf.createEntityManager();
		
		//	Récupération etudiant
		Etudiant etdt = em.find(Etudiant.class, id);
		
		// Ouverture de la transaction
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		//	Persistence Objet Relationnel : suppression d'un élément dans la base
		em.remove(etdt);
		
		//	Fermeture de la transaction
		tx.commit();
		
		//	Fermeture unité de travail
		em.close();
		emf.close();	
		
	}
	
}
