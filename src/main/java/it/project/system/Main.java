package it.project.system;

import it.project.all_dao.UserDAO;
import it.project.card_and_user.UserImp;

public class Main {

	public static void main(String[] args) {
		
		UserImp user1 = new UserImp("Claudio", "Licheri", "14/12/1995", null);
		UserDAO userDAO = new UserDAO();		
		userDAO.create(user1);
		
		user1.setDateOfBirth("01/01/2001");
		userDAO.update(user1);
		
		userDAO.delete(user1);
		
		// JFDNDVDKVNFDJVNVJFBNJFGBFJ
		//ciao
				
	}

}
