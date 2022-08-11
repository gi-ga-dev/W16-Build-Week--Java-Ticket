package it.project.system;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;

import it.project.ticket.AbstractTicket;
import it.project.ticket.SingleTicketImp;
import it.project.ticket.SubscriptionImp;

@Entity
public class DistributorImp extends AbstractSoftware {
			
	public DistributorImp(DistributorStatus status, String emitLocation, List<AbstractTicket> listTicket, List<AbstractTicket> listSubs, LocalDate ticketsTime) {
		super(status, emitLocation, listTicket, listSubs, ticketsTime);		
	}
	
	public DistributorImp() {
		super();
	}
	
}
