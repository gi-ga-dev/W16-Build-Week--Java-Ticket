package it.project.all_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.project.util.JpaUtil;



public class GenericDAO <E, C> {	
	
	//tipizzazione di tipo Class per refer. nel metodo update
	private Class <C> classDAO;
	
	private static final Logger logger = LoggerFactory.getLogger(GenericDAO.class);
		
	public GenericDAO(Class<C> classDAO) {
		super();
		this.classDAO = classDAO;
	}
	
	public GenericDAO() {
		// TODO Auto-generated constructor stub
	}

	// Generic tipo C crea elemento di tipo Classe
	public E create(E ele) {				
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			em.persist(ele);
			transaction.commit();
		} catch (Exception ex) {
			em.getTransaction().rollback();
			logger.error("Error saving object: " + ele.getClass().getSimpleName(), ex);
			throw ex;
		} finally {
			em.close();
		}
		return ele;
	}
	
	public C read(C ele) {		
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			// specificare classe e chiave di lettura
			C us = em.find(classDAO, ele);
			em.close();
			return us;
		} catch (Exception ex) {
			em.getTransaction().rollback();
			logger.error("Error reading object: " + ele.getClass().getSimpleName(), ex);
			throw ex;
		}
	}
	
	public E update(E ele) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {	
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			//em.refresh(em.contains(ele) ? ele : em.merge(ele));
			em.merge(ele);
			transaction.commit();			
		} finally {
			em.close();
		}
		return ele;

	}
	
	public E delete(E ele) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			em.remove(em.contains(ele) ? ele : em.merge(ele));
			transaction.commit();
		} catch (Exception ex) {
			em.getTransaction().rollback();
			logger.error("Error deleting object: " + ele.getClass().getSimpleName(), ex);
			throw ex;
		} finally {
			em.close();
		}
		return ele;
	}

}
