package it.project.system;

import java.time.LocalDate;

import it.project.all_dao.CardDAO;
import it.project.all_dao.SingleTicketDAO;
import it.project.all_dao.SubscriptionDAO;
import it.project.all_dao.UserDAO;
import it.project.all_services.CardService;
import it.project.all_services.SingleTicketService;
import it.project.all_services.SubscriptionService;
import it.project.all_services.UserService;
import it.project.ticket.Duration;

public class Main {

	public static void main(String[] args) {
		
		// ====== Metodi Prosciutto CRUD =======
		
		// ==== Referenze Classi DAO/Service ====
		UserDAO userDAO = new UserDAO();
		CardDAO cardDAO = new CardDAO();
		SubscriptionDAO subDAO = new SubscriptionDAO();
		SingleTicketDAO ticketDAO = new SingleTicketDAO();		
		UserService userServ = new UserService();		
		CardService cardServ = new CardService();		
		SubscriptionService subServ = new SubscriptionService();		
		SingleTicketService ticketServ = new SingleTicketService();		
		
		// ====== Users =======		
		
		userDAO.create(userServ.getClaudio());
		cardDAO.create(cardServ.getCardClaudio());
				
		userServ.getClaudio().setCard(cardServ.getCardClaudio()); // associo carta all'utente
		cardServ.getCardClaudio().setUser(userServ.getClaudio()); // associo utente alla carta

		DistributorImp dis = new DistributorImp();				
		dis.emitSingleTicket("Cotral", 1, 3, LocalDate.now(), LocalDate.now().plusYears(1), userServ.getClaudio());
		dis.emitSubscription("AutoGuidoVie", 1, 5, LocalDate.now(), LocalDate.now().plusYears(1), Duration.MONTHLY, cardServ.getCardClaudio());
		
		cardDAO.update(cardServ.getCardClaudio()); // aggiorno carta
		userDAO.update(userServ.getClaudio());     // aggiorno utente			
		
	}

}
