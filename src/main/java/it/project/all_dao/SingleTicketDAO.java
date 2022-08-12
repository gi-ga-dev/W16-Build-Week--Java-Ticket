package it.project.all_dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import it.project.ticket.AbstractTicket;
import it.project.ticket.SingleTicketImp;
import it.project.util.JpaUtil;

public class SingleTicketDAO extends GenericDAO <SingleTicketImp, Long> {
	
	public List<AbstractTicket> searchByEmitDate(LocalDate emitDate) {
		EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();        
        try {
            Query query = entityManager.createNamedQuery("ticketByEmitDate");
            query.setParameter("emitDate", emitDate);
            List<AbstractTicket> resultList = query.getResultList();
            
            resultList.stream().forEach(ele -> 
            	System.out.println("__________________E' stato emesso un ticket in data ---> " + ele.getEmitDate()));
            
            entityManager.getTransaction().begin();
            entityManager.close();
            
            return resultList;
        } catch(Exception e) {
        	entityManager.close();
            System.out.println("errore");            
            return new ArrayList<AbstractTicket>();
        }		    		
	}

}
