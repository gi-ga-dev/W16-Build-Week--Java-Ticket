package it.project.main;

import it.project.system.AbstractSoftware;
import it.project.users.UserImp;

public class Main {

	public static void main(String[] args) {
		UserImp u = new UserImp();
		System.out.println(u.getListTicket());
		AbstractSoftware a = new AbstractSoftware();
		a.emitSingleTicket(u);
		System.out.println(u.getListTicket().toString());
	}

}
