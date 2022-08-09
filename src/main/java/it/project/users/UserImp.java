package it.project.users;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import it.project.card.SubCardImp;
import it.project.ticket.SingleTicketImp;
import it.project.ticket.SubscriptionImp;


public class UserImp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "surname")
	private String surname;
	
	@Column(name = "dateOfBirth")
	private String dateOfBirth;
	
	@OneToMany
	private ArrayList<SingleTicketImp> listTicket;
	
	@Column(name = "subscription")
	private SubscriptionImp subscription;
	
	@OneToOne	
	private SubCardImp card;
		
	public SubscriptionImp getSubscription() {
		return subscription;
	}

	public void setSubscription(SubscriptionImp subscription) {
		this.subscription = subscription;
	}

	public UserImp(String name, String surname, String dateOfBirth, SubCardImp card) {
		this.name = name;
		this.surname = surname;
		this.dateOfBirth = dateOfBirth;
		this.card = card;
		this.listTicket = new ArrayList<SingleTicketImp>();
	}

	public ArrayList<SingleTicketImp> getListTicket() {
		return listTicket;
	}

	public void setListTicket(ArrayList<SingleTicketImp> listTicket) {
		this.listTicket = listTicket;
	}
	
	public SubCardImp getCard() {
		return card;
	}

	public void setCard(SubCardImp card) {
		this.card = card;
	}

	public UserImp() {
		this.listTicket = new ArrayList<SingleTicketImp>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public SubCardImp getUser() {
		return card;
	}

	public void setUser(SubCardImp card) {
		this.card = card;
	}
	
	
}

