package it.project.system;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import it.project.all_dao.SingleTicketDAO;
import it.project.all_dao.SubscriptionDAO;
import it.project.card_and_user.CardImp;
import it.project.card_and_user.UserImp;
import it.project.ticket.AbstractTicket;
import it.project.ticket.Duration;
import it.project.ticket.SingleTicketImp;
import it.project.ticket.SubscriptionImp;

@Entity
@Table(name="distributors_and_retailers", schema="ele_transport")
public abstract class AbstractSoftware implements Software {

	@Id
	@SequenceGenerator(name = "software_seq", sequenceName = "software_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "software_seq")
	@Column(name = "id")
	private Long id;
	
	@OneToMany
	@Column(name = "subs_list")
	private List<SubscriptionImp> listSubs;	
	
	@OneToMany
	@Column(name = "tickets_list")
	private List<SingleTicketImp> listTicket;	
	
	@Column(name = "status")
	private DistributorStatus status;
	@Column(name = "emitLocation")
	private String emitLocation;    		// location di emissione
	@Column(name = "ticketsTime")
	private LocalDate ticketsTime;  		// ticket emessi in un dato periodo

	public AbstractSoftware(DistributorStatus status, String emitLocation, List<SingleTicketImp> listTicket, List<SubscriptionImp> listSubs, LocalDate ticketsTime) {
		super();
		this.status = status;
		this.emitLocation = emitLocation;
		this.ticketsTime = ticketsTime;
		// quando istanzio un oggetto crea una lista vuota
		this.listTicket = new ArrayList<SingleTicketImp>();
		this.listSubs = new ArrayList<SubscriptionImp>();
	}
	
	public AbstractSoftware(String emitLocation, List<SingleTicketImp> listTicket, List<SubscriptionImp> listSubs, LocalDate ticketsTime) {
		super();
		this.emitLocation = emitLocation;
		this.ticketsTime = ticketsTime;
		this.listTicket = new ArrayList<SingleTicketImp>();
		this.listSubs = new ArrayList<SubscriptionImp>();
	}
	
	public AbstractSoftware() {
		super();
	}
		
	@Override
	public void emitSingleTicket(String company, int code, int price, LocalDate emitDate, LocalDate expDate) {
		SingleTicketImp ticket = new SingleTicketImp(company, code, price, emitDate, expDate);
		//user.getListTicket().add(ticket);
		SingleTicketDAO ticketDAO = new SingleTicketDAO();
		ticketDAO.create(ticket);
	}

	@Override
	public void emitSubscription(String company, int code, int price, LocalDate emitDate, LocalDate expDate,
			Duration duration, CardImp card) {
		if (card.checkStatus()) {
			SubscriptionImp subscription = new SubscriptionImp(company, code, price, emitDate, expDate, duration, card);
			card.getListSubs().add(subscription);
			SubscriptionDAO subDAO = new SubscriptionDAO();
			subDAO.create(subscription);
		} else {
			System.out.println("carta scaduta");
		}
	}

	// ====== Getters ======
	
	public DistributorStatus getStatus() { return status; }
	public String getEmitLocation() { return emitLocation; }
	public LocalDate getTicketsTime() {	return ticketsTime;	}
	public List<SubscriptionImp> getListSubs() { return listSubs; }
	public List<SingleTicketImp> getListTicket() { return listTicket; }	
	
	// ====== Setters ======

	public void setStatus(DistributorStatus status) { this.status = status; }	
	public void setEmitLocation(String emitLocation) { this.emitLocation = emitLocation; }	
	public void setTicketsTime(LocalDate ticketsTime) {	this.ticketsTime = ticketsTime;	}
	public void setListSubs(List<SubscriptionImp> listSubs) { this.listSubs = listSubs;	}
	public void setListTicket(List<SingleTicketImp> listTicket) { this.listTicket = listTicket;	}	

}
