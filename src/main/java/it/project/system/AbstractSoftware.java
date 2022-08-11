package it.project.system;

import java.time.LocalDate;

import it.project.all_dao.SingleTicketDAO;
import it.project.card_and_user.UserImp;
import it.project.ticket.SingleTicketImp;
import it.project.ticket.SubscriptionImp;


public abstract class AbstractSoftware implements Software {

	private DistributorStatus status;
	private String emitLocation;
	
	public AbstractSoftware() {
		this.status = DistributorStatus.ACTIVE;
	}
	
//	@Override
//	public void emitSingleTicket(String company, int code, int price, LocalDate emitDate, LocalDate expDate,
//			UserImp user) {
//		SingleTicketImp ticket = new SingleTicketImp(company, code, price, emitDate, expDate, user);
//		user.getListTicket().add(ticket);	
//	
//		SingleTicketDAO ticketDAO = new SingleTicketDAO();
//		ticketDAO.create(ticket);
//	}
	
	@Override
	public void emitSingleTicket(String company, int code, int price, LocalDate emitDate, LocalDate expDate,
			UserImp user) {
		SingleTicketImp ticket = new SingleTicketImp(company, code, price, emitDate, expDate, user);
		user.getListTicket().add(ticket);	
		SingleTicketDAO ticketDAO = new SingleTicketDAO();
		ticketDAO.create(ticket);
	}

	@Override
	public void emitSubscription(UserImp user) {
		if (user.getCard().checkStatus()) {
			SubscriptionImp subscription = new SubscriptionImp();
			user.setSubscription(subscription);
		} else {
			System.out.println("carta scaduta");
		}
	}
	
	// ====== Getters ======
	
	public DistributorStatus getStatus() { return status; }
	public String getEmitLocation() { return emitLocation; }
	
	// ====== Setters ======	

	public void setStatus(DistributorStatus status) { this.status = status;	}
	public void setEmitLocation(String emitLocation) { this.emitLocation = emitLocation; }
	
}
