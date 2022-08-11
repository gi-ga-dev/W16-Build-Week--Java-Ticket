package it.project.system;

import java.time.LocalDate;

import it.project.card_and_user.CardImp;
import it.project.card_and_user.UserImp;
import it.project.ticket.Duration;

public interface Software {
	
	void emitSingleTicket(String company, int code, int price, LocalDate emitDate, LocalDate expDate, UserImp user);
	
	void emitSubscription(String company, int code, int price, LocalDate emitDate, LocalDate expDate, Duration duration, CardImp card);
}
