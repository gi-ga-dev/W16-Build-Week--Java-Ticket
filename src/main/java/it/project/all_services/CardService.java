package it.project.all_services;

import java.time.LocalDate;

import it.project.card_and_user.CardImp;

public class CardService {

	UserService userService = new UserService();
	private CardImp cardClaudio = new CardImp("Cotral", 12, LocalDate.now(), null);
	private CardImp cardElois = new CardImp("AutoGuidoVie", 34, LocalDate.now(), null);
	private CardImp cardGianluca = new CardImp("Seatour", 56, LocalDate.now(), null);
	private CardImp cardEmanuel = new CardImp("Atac", 78, LocalDate.now(), null);
	private CardImp cardMassimiliano = new CardImp("FlixBus", 90, LocalDate.now(), null);	
	
	// ====== Getters ======
	
	public CardImp getCardClaudio() { return cardClaudio; }
	public CardImp getCardElois() {	return cardElois; }
	public CardImp getCardGianluca() { return cardGianluca;	}
	public CardImp getCardEmanuel() { return cardEmanuel; }
	public CardImp getCardMassimiliano() { return cardMassimiliano;	}
	
	// ====== Setters ======
	
	public void setCardClaudio(CardImp cardClaudio) { this.cardClaudio = cardClaudio; }	
	public void setCardElois(CardImp cardElois) { this.cardElois = cardElois; }	
	public void setCardGianluca(CardImp cardGianluca) {	this.cardGianluca = cardGianluca; }	
	public void setCardEmanuel(CardImp cardEmanuel) { this.cardEmanuel = cardEmanuel; }	
	public void setCardMassimiliano(CardImp cardMassimiliano) {	this.cardMassimiliano = cardMassimiliano; }
}
