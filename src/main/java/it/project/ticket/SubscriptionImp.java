package it.project.ticket;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import it.project.card_and_user.CardImp;
import it.project.card_and_user.UserImp;

@Entity
public class SubscriptionImp extends AbstractTicket {
		
	private Duration duration;
	
	@ManyToOne
	private CardImp card;

	public SubscriptionImp(String company, int code, int price, LocalDate emitDate, LocalDate expDate,
			Duration duration, CardImp card, UserImp user) {
		super(company, code, price, emitDate, expDate, user);		
		this.duration = duration;
		this.card = card;
	}
	
	public SubscriptionImp() { super();	}
	
	// ====== Getters ======
	
	public CardImp getCard() { return card;	}
	public Duration getDuration() {	return duration; }
	
	// ====== Setters ======	

	public void setCard(CardImp card) {	this.card = card; }	
	public void setDuration(Duration duration) { this.duration = duration; }
		
}
