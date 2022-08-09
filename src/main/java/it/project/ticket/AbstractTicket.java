package it.project.ticket;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import it.project.system.DistributorImp;
import it.project.system.RetailerImp;
import it.project.users.UserImp;

public class AbstractTicket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
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
	public AbstractTicket(UserImp user, String company, int ticketCode, int ticketPrice, LocalDate emitDate,
			LocalDate expDate, DistributorImp distributor, RetailerImp retailer) {
		super();
		this.user = user;
		this.company = company;
		this.ticketCode = ticketCode;
		this.ticketPrice = ticketPrice;
		this.emitDate = emitDate;
		this.expDate = expDate;
		this.distributor = distributor;
		this.retailer = retailer;
	}
	public AbstractTicket() {
		super();
	}
	public UserImp getUser() {
		return user;
	}
	public void setUser(UserImp user) {
		this.user = user;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getTicketCode() {
		return ticketCode;
	}
	public void setTicketCode(int ticketCode) {
		this.ticketCode = ticketCode;
	}
	public int getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public LocalDate getEmitDate() {
		return emitDate;
	}
	public void setEmitDate(LocalDate emitDate) {
		this.emitDate = emitDate;
	}
	public LocalDate getExpDate() {
		return expDate;
	}
	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}
	public DistributorImp getDistributor() {
		return distributor;
	}
	public void setDistributor(DistributorImp distributor) {
		this.distributor = distributor;
	}
	public RetailerImp getRetailer() {
		return retailer;
	}
	public void setRetailer(RetailerImp retailer) {
		this.retailer = retailer;
	}
		
	
}
