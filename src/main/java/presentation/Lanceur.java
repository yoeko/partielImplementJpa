package presentation;

import java.util.Date;

import domaine.Etudiant;
import domaine.Personne;
import service.EtudiantService;

public class Lanceur {

	public static void main(String[] args) {
			
		Etudiant etudiant = new Etudiant("Jules", "KLU", "jkl@gmail.com", "Paris", "2234232345", new Date());
		
//		Personne personne = new Personne("Jules", "KLU", "jkl@gmail.com", "Paris", "2234232345", new Date());
		
		EtudiantService etudiantService = new EtudiantService();
		etudiantService.createEtudiant(etudiant);
		
		
	}

}
