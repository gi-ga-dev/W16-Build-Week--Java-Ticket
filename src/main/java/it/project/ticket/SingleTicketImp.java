package it.project.ticket;

public class SingleTicketImp extends AbstractTicket {
	
	String string;
	
	public SingleTicketImp(){
		string = "vero";
	}

	@Override
	public String toString() {
		return "SingleTicketImp [string=" + string + "]";
	}
	
}
