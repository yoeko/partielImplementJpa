package service;

import dao.UserDao;
import domaine.User;

public class UserService {
	
	UserDao userDao = new UserDao();
	
	public void createUser(User user) {
		userDao.createUser(user);
	}
}
