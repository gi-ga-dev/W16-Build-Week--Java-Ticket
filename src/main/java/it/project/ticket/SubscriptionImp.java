package it.project.ticket;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import it.project.card_and_user.CardImp;
import it.project.card_and_user.UserImp;

@Entity
public class SubscriptionImp extends AbstractTicket {
	
	@OneToOne
	private UserImp user;
	private Duration duration;
	
	@OneToOne
	private CardImp card;

	public SubscriptionImp(String company, int code, int price, LocalDate emitDate, LocalDate expDate,
			UserImp user, Duration duration, CardImp card) {
		super(company, code, price, emitDate, expDate);
		this.user = user;
		this.duration = duration;
		this.card = card;
	}
	
	public SubscriptionImp() { super();	}
	
	// ====== Getters ======
	
	public UserImp getUser() { return user;	}
	public CardImp getCard() { return card;	}
	public Duration getDuration() {	return duration; }
	
	// ====== Setters ======	

	public void setUser(UserImp user) {	this.user = user; }
	public void setCard(CardImp card) {	this.card = card; }	
	public void setDuration(Duration duration) { this.duration = duration; }
		
}
