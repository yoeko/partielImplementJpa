package service;

import dao.EtudiantDao;
import domaine.Etudiant;
import domaine.Personne;

public class EtudiantService {
	
	EtudiantDao etudiantDao = new EtudiantDao();
	
	public void createEtudiant(Etudiant etudiant) {
		etudiantDao.createEtudiant(etudiant);
	}
}
