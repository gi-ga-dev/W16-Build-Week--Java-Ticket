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
import it.project.card_and_user.UserImp;
import it.project.ticket.Duration;
import it.project.ticket.SubscriptionImp;

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
		// (String name, String surname, String dateOfBirth, CardImp card, SubscriptionImp subscription)
		userDAO.create(userServ.getClaudio());
		cardDAO.create(cardServ.getCardClaudio());
		
		userServ.getClaudio().setCard(cardServ.getCardClaudio()); // associo carta all'utente
		cardServ.getCardClaudio().setUser(userServ.getClaudio()); // associo utente alla carta
		
		cardDAO.update(cardServ.getCardClaudio()); // aggiorno carta
		userDAO.update(userServ.getClaudio());     // aggiorno utente
		
		SubscriptionImp subCla = new SubscriptionImp("Cotral", 4959, 2, LocalDate.now(), LocalDate.now().plusYears(1), userServ.getClaudio(), Duration.MONTHLY, cardServ.getCardClaudio());
		
				
		//AbstractSoftware abs = new AbstractSoftware();
		//abs.emitSubscription(userServ.getClaudio());                // emetto subscription vuota
		//subServ.getSubClaudio().setCard(cardServ.getCardClaudio()); // prendo sub e setto carta
		//subServ.getSubClaudio().setUser(userServ.getClaudio());     // prendo sub e setto utente
		
		cardDAO.update(cardServ.getCardClaudio()); // aggiorno carta
		userDAO.update(userServ.getClaudio());     // aggiorno utente
		subDAO.update(subServ.getSubClaudio());    // aggiorno subscription
				
		
	}

}
