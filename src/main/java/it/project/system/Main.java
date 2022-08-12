package it.project.system;

import java.io.ObjectInputFilter.Status;
import java.time.LocalDate;

import it.project.all_dao.CardDAO;
import it.project.all_dao.DistributorDAO;
import it.project.all_dao.RetailerDAO;
import it.project.all_dao.SingleTicketDAO;
import it.project.all_dao.SubscriptionDAO;
import it.project.all_dao.UserDAO;
import it.project.all_services.CardService;
import it.project.all_services.DistributorService;
import it.project.all_services.RetailerService;
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
		DistributorDAO distDAO = new DistributorDAO();
		RetailerDAO retailDAO = new RetailerDAO();
		
		UserService userServ = new UserService();		
		CardService cardServ = new CardService();		
		SubscriptionService subServ = new SubscriptionService();		
		SingleTicketService ticketServ = new SingleTicketService();	
		DistributorService distServ = new DistributorService();
		RetailerService retailServ = new RetailerService();
		
		// ====== User / Card ======
				
		userDAO.create(userServ.getClaudio());
		cardDAO.create(cardServ.getCardClaudio());
				
		userServ.getClaudio().setCard(cardServ.getCardClaudio()); // associo carta all'utente
		cardServ.getCardClaudio().setUser(userServ.getClaudio()); // associo utente alla carta
		
		// ====== Distributor / Retailer ======	
		
		distDAO.create(distServ.getDistributor1());
		
		distServ.getDistributor1().emitSingleTicket("Cotral", 10, 3, LocalDate.now(), LocalDate.now().plusYears(1), distServ.getDistributor1());
		distServ.getDistributor1().emitSubscription("AutoGuidoVie", 10, 5, LocalDate.now(), LocalDate.now().plusYears(1), Duration.MONTHLY, cardServ.getCardClaudio(), distServ.getDistributor1());
		
		distServ.getDistributor1().setListTicket(distServ.getDistributor1().getListTicket());
		distServ.getDistributor1().setListSubs(distServ.getDistributor1().getListSubs());
		
		distDAO.update(distServ.getDistributor1());
		
		// ------------------------------------------
		
		distDAO.create(distServ.getDistributor2());
		
		distServ.getDistributor2().emitSingleTicket("Atac", 20, 3, LocalDate.now(), LocalDate.now().plusYears(1), distServ.getDistributor2());
		distServ.getDistributor2().emitSubscription("Seatour", 20, 5, LocalDate.now(), LocalDate.now().plusYears(1), Duration.MONTHLY, cardServ.getCardClaudio(), distServ.getDistributor2());
		
		distServ.getDistributor2().setListTicket(distServ.getDistributor2().getListTicket());
		distServ.getDistributor2().setListSubs(distServ.getDistributor2().getListSubs());
		
		distDAO.update(distServ.getDistributor2());
		
//		RetailerImp retailer = new RetailerImp();
//		retailer.emitSingleTicket("Cotral", 1, 3, LocalDate.now(), LocalDate.now().plusYears(1));
//		retailer.emitSubscription("AutoGuidoVie", 1, 5, LocalDate.now(), LocalDate.now().plusYears(1), Duration.MONTHLY, cardServ.getCardClaudio());
//			
		cardDAO.update(cardServ.getCardClaudio()); // aggiorno carta
		userDAO.update(userServ.getClaudio());     // aggiorno utente			
		
	}

}
