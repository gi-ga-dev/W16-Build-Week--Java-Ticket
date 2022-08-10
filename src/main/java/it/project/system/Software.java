package it.project.system;

import it.project.card_and_user.UserImp;

public interface Software {
	
	void emitSingleTicket(UserImp user);
	void emitSubscription(UserImp user);
}
