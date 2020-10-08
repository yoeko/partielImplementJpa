package service;

import dao.CoursDao;
import domaine.Cours;

public class CoursService {
	
	CoursDao coursDao = new CoursDao();
	
	public void createCours(Cours cours) {
		coursDao.createCours(cours);
	}

}
