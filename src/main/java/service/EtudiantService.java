package service;

import dao.EtudiantDao;
import domaine.Etudiant;

public class EtudiantService {
	
	EtudiantDao etudiantDao = new EtudiantDao();
	
	public void createEtudiant(Etudiant etudiant) {
		etudiantDao.createEtudiant(etudiant);
	}
	
	public Etudiant getEtudiant(Long id) {
		return etudiantDao.getEtudiant(id);
	}
	
	public void updateEtudiant(Etudiant etudiant, Etudiant nEtudiant) {
		etudiantDao.updateEtudiant(etudiant, nEtudiant);
	}
	
	public void deleteEtudiant(Long id) {
		etudiantDao.deleteEtudiant(id);
	}
}
