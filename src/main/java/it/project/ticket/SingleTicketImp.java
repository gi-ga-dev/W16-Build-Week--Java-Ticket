package it.project.ticket;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class SingleTicketImp extends AbstractTicket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	String string;
	
	public SingleTicketImp(){
		string = "vero";
	}

	@Override
	public String toString() {
		return "SingleTicketImp [string=" + string + "]";
	}
	
}
