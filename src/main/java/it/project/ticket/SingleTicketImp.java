package it.project.ticket;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import it.project.card_and_user.UserImp;

@Entity
public class SingleTicketImp extends AbstractTicket {
	
	public SingleTicketImp(String company, int code, int price, LocalDate emitDate, LocalDate expDate) {
		super(company, code, price, emitDate, expDate);		
	}	
	
	public SingleTicketImp() {
		super();
	}
	
}
