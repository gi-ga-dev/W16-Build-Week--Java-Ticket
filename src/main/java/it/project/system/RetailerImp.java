package it.project.system;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;

import it.project.ticket.AbstractTicket;
import it.project.ticket.SingleTicketImp;
import it.project.ticket.SubscriptionImp;

@Entity
public class RetailerImp extends AbstractSoftware {

	public RetailerImp(String emitLocation, List<AbstractTicket> listTicket, List<AbstractTicket> listSubs, LocalDate ticketsTime) {
		super(emitLocation, listTicket, listSubs, ticketsTime);		
	}
	
	public RetailerImp() {
		super();
	}
}
