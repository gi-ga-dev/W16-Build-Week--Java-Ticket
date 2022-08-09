package it.project.card;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import it.project.users.UserImp;


public class SubCardImp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	private String company;
	private int cardCode;	
	private LocalDate cardEmitDate;
	private LocalDate cardValidity; // LocalDate.now().plusYears(1)
	
	@OneToOne
	UserImp user;

	public SubCardImp(String company, int cardCode, LocalDate cardEmitDate, UserImp user) {
		super();
		this.company = company;
		this.cardCode = cardCode;
		this.cardEmitDate = cardEmitDate;
		this.cardValidity = cardEmitDate.plusYears(1);
		this.user = user;
	}

	public SubCardImp() {
		super();
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getCardCode() {
		return cardCode;
	}

	public void setCardCode(int cardCode) {
		this.cardCode = cardCode;
	}

	public LocalDate getCardEmitDate() {
		return cardEmitDate;
	}

	public void setCardEmitDate(LocalDate cardEmitDate) {
		this.cardEmitDate = cardEmitDate;
	}

	public LocalDate getCardValidity() {
		return cardValidity;
	}

	public void setCardValidity(LocalDate cardValidity) {
		this.cardValidity = cardValidity;
	}

	public UserImp getUser() {
		return user;
	}

	public void setUser(UserImp user) {
		this.user = user;
	}
	
	public boolean checkStatus() {
		if (LocalDate.now().isAfter(this.cardValidity)) {
			return false;
		}
		return true;
	}
	
	
}
