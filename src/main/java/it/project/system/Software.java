package it.project.system;

import java.time.LocalDate;

import it.project.card_and_user.UserImp;

public interface Software {
	
	void emitSingleTicket(String company, int code, int price, LocalDate emitDate, LocalDate expDate,
			UserImp user);
	void emitSubscription(UserImp user);
}
