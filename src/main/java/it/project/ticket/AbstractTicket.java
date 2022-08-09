package it.project.ticket;

import java.time.LocalDate;
import it.project.system.DistributorImp;
import it.project.system.RetailerImp;
import it.project.users.UserImp;

public class AbstractTicket {
	
	private UserImp user;
	private String company;
	private int ticketCode;	
	private int ticketPrice;
	private LocalDate emitDate;
	private LocalDate expDate;
	// per sapere se lo ha emesso il dist. o il retailer
	// istanziare distributori e retailers nel main e passare nei parametri del ticket
	private DistributorImp distributor;
	private RetailerImp retailer;
		
}
