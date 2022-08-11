package it.project.ticket;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import it.project.all_dao.SingleTicketDAO;
import it.project.card_and_user.UserImp;

@Entity
public class SingleTicketImp extends AbstractTicket {
	
	@ManyToOne
	private UserImp user;

	public SingleTicketImp(String company, int code, int price, LocalDate emitDate, LocalDate expDate,
			UserImp user) {
		super(company, code, price, emitDate, expDate);
		this.user = user;
	}	
	
	public SingleTicketImp() {
		super();
	}
	
}
