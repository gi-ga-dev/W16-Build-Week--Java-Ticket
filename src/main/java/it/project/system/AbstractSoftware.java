package it.project.system;

import it.project.ticket.SingleTicketImp;
import it.project.ticket.SubscriptionImp;
import it.project.ticketDAO.SingleTicketDAO;
import it.project.ticketDAO.SubscriptionDAO;
import it.project.users.UserImp;

public class AbstractSoftware implements Software {

	private DistributorStatus status;
	private String emitLocation;
	
	public AbstractSoftware() {
		this.status = DistributorStatus.ACTIVE;
	}
	
	@Override
	public void emitSingleTicket(UserImp user) {
		SingleTicketImp ticket = new SingleTicketImp();
		user.getListTicket().add(ticket);
		SingleTicketDAO dao = new SingleTicketDAO();
		dao.save(ticket);
	}

	@Override
	public void emitSubscription(UserImp user) {
		if (user.getCard().checkStatus()) {
			SubscriptionImp subscription = new SubscriptionImp();
			user.setSubscription(subscription);
			SubscriptionDAO dao = new SubscriptionDAO();
			dao.save(subscription);
		} else {
			System.out.println("carta scaduta");
		}
	}

	public DistributorStatus getStatus() {
		return status;
	}

	public void setStatus(DistributorStatus status) {
		this.status = status;
	}

	public String getEmitLocation() {
		return emitLocation;
	}

	public void setEmitLocation(String emitLocation) {
		this.emitLocation = emitLocation;
	}
	
	

	
}
