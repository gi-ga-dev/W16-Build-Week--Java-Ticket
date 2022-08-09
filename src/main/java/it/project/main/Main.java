package it.project.main;

import it.project.card.SubCardDAO;
import it.project.card.SubCardImp;
import it.project.system.AbstractSoftware;
import it.project.users.UserDAO;
import it.project.users.UserImp;

public class Main {

	public static void main(String[] args) {
		UserImp u = new UserImp();
		UserDAO dao = new UserDAO();
		dao.save(u);
		SubCardImp card = new SubCardImp();
		u.setCard(card);
		SubCardDAO cardDAO = new SubCardDAO();
		cardDAO.save(card);
		AbstractSoftware a = new AbstractSoftware();
		a.emitSingleTicket(u);
		a.emitSubscription(u);
	}

}
