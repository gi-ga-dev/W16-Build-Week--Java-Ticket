package it.project.card_and_user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import it.project.ticket.SingleTicketImp;
import it.project.ticket.SubscriptionImp;

@Entity
@Table(name="cards", schema="ele_transport")
public class CardImp {
	
	@Id
	@SequenceGenerator(name = "card_seq", sequenceName = "card_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "card_seq")
	@Column(name = "id")
	private Long id;
	
	@Column(name = "company")
	private String company;
	@Column(name = "card_code")
	private int cardCode;	
	@Column(name = "emit_date")
	private LocalDate cardEmitDate;
	@Column(name = "validity")
	private LocalDate cardValidity; // LocalDate.now().plusYears(1)
	
	// quando una classe e' correlata con una lista si creare un table con i lock in piu' (con mappedBy lo rimuovi)	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "card") // si riferisce alla prop. card (in SubscriptionImp)
	private List<SubscriptionImp> listSubs;
	
	@OneToOne
	private UserImp user;

	public CardImp(String company, int cardCode, LocalDate cardEmitDate, UserImp user) {
		super();
		this.company = company;
		this.cardCode = cardCode;
		this.cardEmitDate = cardEmitDate;
		this.cardValidity = cardEmitDate.plusYears(1);
		this.listSubs = new ArrayList<SubscriptionImp>();
		this.user = user;
	}

	public CardImp() { super();	}
	
	public boolean checkStatus() {
		if (LocalDate.now().isAfter(this.cardValidity)) {
			return false;
		}
		return true;
	}
	
	// ====== Getters ======
		
	public UserImp getUser() { return user;	}
	public String getCompany() { return company; }
	public int getCardCode() { return cardCode;	}
	public LocalDate getCardEmitDate() { return cardEmitDate; }
	public LocalDate getCardValidity() { return cardValidity; }
	public List<SubscriptionImp> getListSubs() { return listSubs; }
	
	// ====== Setters ======	

	public void setUser(UserImp user) {	this.user = user; }		
	public void setCompany(String company) { this.company = company; }	
	public void setCardCode(int cardCode) {	this.cardCode = cardCode; }	
	public void setCardEmitDate(LocalDate cardEmitDate) { this.cardEmitDate = cardEmitDate;	}	
	public void setCardValidity(LocalDate cardValidity) { this.cardValidity = cardValidity;	}	
	public void setListSubs(List<SubscriptionImp> listSubs) { this.listSubs = listSubs;	}
	
}
