package it.project.card_and_user;

import java.time.LocalDate;
import javax.persistence.OneToOne;

public class CardImp {
	
	private String company;
	private int cardCode;	
	private LocalDate cardEmitDate;
	private LocalDate cardValidity; // LocalDate.now().plusYears(1)
	
	@OneToOne
	UserImp user;

	public CardImp(String company, int cardCode, LocalDate cardEmitDate, LocalDate cardValidity, UserImp user) {
		super();
		this.company = company;
		this.cardCode = cardCode;
		this.cardEmitDate = cardEmitDate;
		this.cardValidity = cardValidity;
		this.user = user;
	}

	public CardImp() {
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
	
	
}