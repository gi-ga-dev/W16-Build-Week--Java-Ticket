package it.project.system;

import it.project.users.UserImp;

public interface Software {
	
	void emitSingleTicket(UserImp user);
	void emitSubscription(UserImp user);
}
