package it.project.card_and_user;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import it.project.ticket.SingleTicketImp;
import it.project.ticket.SubscriptionImp;

@Entity
public class UserImp {
	
	@Id
	@SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
	@Column(name = "id")
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "surname")
	private String surname;
	
	@Column(name = "dateOfBirth")
	private String dateOfBirth;
	
	@OneToMany
	private List<SingleTicketImp> listTicket;
	
	@OneToOne	
	private SubscriptionImp subscription;
	
	@OneToOne	
	private CardImp card;
		
	public UserImp(String name, String surname, String dateOfBirth, CardImp card, SubscriptionImp subscription) {
		this.name = name;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.card = card;
		this.subscription = subscription;
		this.listTicket = new ArrayList<SingleTicketImp>();
	}
	
	public UserImp() { this.listTicket = new ArrayList<SingleTicketImp>(); }
	
	// ====== Getters ======
	
	public long getId() { return id; }
	public String getName() { return name; }
	public String getSurname() { return surname; }
	public String getDateOfBirth() { return dateOfBirth; }
	public CardImp getCard() { return card;	}
	public SubscriptionImp getSubscription() { return subscription;	}
	public List<SingleTicketImp> getListTicket() { return listTicket; }
		
	// ====== Setters ======	
	
	public void setName(String name) { this.name = name; }
	public void setSurname(String surname) { this.surname = surname; }
	public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }
	public void setCard(CardImp card) { this.card = card; }
	public void setSubscription(SubscriptionImp subscription) {	this.subscription = subscription; }
	public void setListTicket(List<SingleTicketImp> listTicket) { this.listTicket = listTicket;	}
}

