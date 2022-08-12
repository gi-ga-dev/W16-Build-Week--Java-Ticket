package it.project.ticket;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import it.project.card_and_user.UserImp;
import it.project.system.AbstractSoftware;

@Entity
public class SingleTicketImp extends AbstractTicket {
	
	public SingleTicketImp(String company, int code, int price, LocalDate emitDate, LocalDate expDate, AbstractSoftware emittedEntity) {
		super(company, code, price, emitDate, expDate, emittedEntity);		
	}	
	
	public SingleTicketImp() {
		super();
	}
	
}
