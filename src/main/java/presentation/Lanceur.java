package presentation;

import java.util.Date;

import domaine.Cours;
import domaine.Etudiant;
import domaine.User;
import service.EtudiantService;
import service.UserService;

public class Lanceur {

	public static void main(String[] args) {
		
		//	create etudiant
		//	createEtudiant();
		
		//	get etudiant	
		//	getEtdudiant((long) 2);
		
		//	update etudiant	
		//	updateEtudiant();	
		
		//	delete etudiant	
		//	deleteEtudiant((long) 2);
		
	}

	private static void createEtudiant() {
		//	Nouvelle instance de cours	
		Cours cours = new Cours("Histoire", 35);
		
		//	Create Etudiant avec un cours	
		Etudiant etudiant = new Etudiant("Norbert", "Zongo", "jkl@gmail.com", "Paris", "2234232345", new Date(), cours);
		EtudiantService etudiantService = new EtudiantService();
		etudiantService.createEtudiant(etudiant);
		
	}
	
	public static void getEtdudiant(Long id) {
		//	Get Etudiant
		EtudiantService etudiantService = new EtudiantService();
		Etudiant etudiant = etudiantService.getEtudiant(id);
		System.out.println("Nom: " + etudiant.getFirst_name() + ", Pénom: " + etudiant.getLast_name());
	}
	
	public static void updateEtudiant() {
		//	Update Etudiant
		Cours cours = new Cours("Histoire", 35);
		Etudiant etudiant = new Etudiant("Norbert", "Zongo", "jkl@gmail.com", "Paris", "2234232345", new Date(), cours);
		Cours cours2 = new Cours("Maths", 90);
		Etudiant nEtudiant = new Etudiant("Boubacar", "Zongo", "jkl@gmail.com", "Paris", "2234232345", new Date(), cours2);
		EtudiantService etudiantService2 = new EtudiantService();
		etudiantService2.updateEtudiant(etudiant, nEtudiant);
	}
	
	public static void deleteEtudiant(Long id) {
		EtudiantService etudiantService = new EtudiantService();
		etudiantService.deleteEtudiant(id);
	}
	
	public static void createUser() {
		//	Create User	
		User user = new User("Jules", "LoBi", "jl@jl.com", "10 Avenue", "3454343456", new Date(), "JESUIS", "monpain", "D");
		UserService userService = new UserService();
		userService.createUser(user);
		
	}

}
