package it.project.system;

import it.project.ticket.SingleTicketImp;
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
	}

	@Override
	public void emitSubscription() {
		
	}

	@Override
	public void checkValidity() {
		
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
