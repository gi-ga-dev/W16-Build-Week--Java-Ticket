package it.project.ticket;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import it.project.card_and_user.UserImp;
import it.project.system.AbstractSoftware;
import it.project.system.DistributorImp;
import it.project.system.RetailerImp;

@Entity
@Table(name="tickets_and_subs", schema="ele_transport")
@NamedQuery(name="ticketByEmitDate", query="SELECT ele FROM AbstractTicket ele WHERE ele.emitDate =:emitDate")
public abstract class AbstractTicket {
	
	@Id
	@SequenceGenerator(name = "ticket_seq", sequenceName = "ticket_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ticket_seq")
	@Column(name = "id")
	private Long id;	
	
	@Column(name = "company")
	private String company;
	@Column(name = "code")
	private int code;	
	@Column(name = "price")
	private int price;
	@Column(name = "emitDate")
	private LocalDate emitDate;
	@Column(name = "expDate")
	private LocalDate expDate;		
			
	@ManyToOne
	private AbstractSoftware emittedEntity;
		
	public AbstractTicket(String company, int code, int price, LocalDate emitDate, LocalDate expDate, AbstractSoftware emittedEntity) {
		super();		
		this.company = company;
		this.code = code;
		this.price = price;
		this.emitDate = emitDate;
		this.expDate = expDate;
		this.emittedEntity = emittedEntity;
	}	

	public AbstractTicket() {
		super();
	}	

	// ====== Getters ======
	
	public Long getId() { return id; }
	public int getCode() { return code;	}
	public int getPrice() { return price; }
	public String getCompany() { return company; }
	public LocalDate getEmitDate() { return emitDate; }
	public LocalDate getExpDate() {	return expDate;	}
	public AbstractSoftware getEmittedEntity() { return emittedEntity; }
	
	// ====== Setters ======
	
	public void setId(Long id) { this.id = id; }	
	public void setCode(int code) { this.code = code; }	
	public void setPrice(int price) { this.price = price; }	
	public void setCompany(String company) { this.company = company; }	
	public void setEmitDate(LocalDate emitDate) { this.emitDate = emitDate;	}	
	public void setExpDate(LocalDate expDate) {	this.expDate = expDate;	}
	public void setEmittedEntity(AbstractSoftware emittedEntity) { this.emittedEntity = emittedEntity; }
	
}
