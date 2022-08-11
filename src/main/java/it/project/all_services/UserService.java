package it.project.all_services;

import it.project.card_and_user.UserImp;

public class UserService {
	
	// Creare metodo per la creazione di oggetti
	
	private UserImp claudio = new UserImp("Claudio", "Licheri", "14/12/1995", null, null, null);
	private UserImp elois = new UserImp("Elois", "Mandotti", "10/09/1998", null, null, null);
	private UserImp gianluca = new UserImp("Gianluca", "Gallone", "17/04/1992", null, null, null);
	private UserImp emanuel = new UserImp("Emanuel", "Tancau", "07/11/1998", null, null, null);
	private UserImp massimiliano = new UserImp("Massimiliano", "Zingali", "14/05/1985", null, null, null);
	
	// ====== Getters ======
	
	public UserImp getClaudio() { return claudio; }
	public UserImp getElois() {	return elois; }
	public UserImp getGianluca() { return gianluca; }
	public UserImp getEmanuel() { return emanuel; }
	public UserImp getMassimiliano() { return massimiliano;	}
	
	// ====== Setters ======	
	
	public void setClaudio(UserImp claudio) { this.claudio = claudio; }	
	public void setElois(UserImp elois) { this.elois = elois; }	
	public void setGianluca(UserImp gianluca) {	this.gianluca = gianluca; }	
	public void setEmanuel(UserImp emanuel) { this.emanuel = emanuel; }	
	public void setMassimiliano(UserImp massimiliano) {	this.massimiliano = massimiliano; }		
	
}
