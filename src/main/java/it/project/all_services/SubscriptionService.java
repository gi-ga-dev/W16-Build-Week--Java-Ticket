package it.project.all_services;

import java.time.LocalDate;
import it.project.ticket.Duration;
import it.project.ticket.SubscriptionImp;

public class SubscriptionService {
	
	private SubscriptionImp subClaudio = new SubscriptionImp("Cotral", 4959, 2, LocalDate.now(), LocalDate.now().plusYears(1), null, Duration.MONTHLY, null);
	
	// ====== Getters ======
	
	public SubscriptionImp getSubClaudio() { return subClaudio; }

	// ====== Setters ======
	
	public void setSubClaudio(SubscriptionImp subClaudio) {	this.subClaudio = subClaudio; }

	
}
