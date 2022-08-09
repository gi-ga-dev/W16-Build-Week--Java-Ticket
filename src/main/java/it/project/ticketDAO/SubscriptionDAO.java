package it.project.ticketDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.project.ticket.SubscriptionImp;
import it.project.util.JpaUtil;

public class SubscriptionDAO {
    private static final Logger logger = LoggerFactory.getLogger(SubscriptionDAO.class);

    public void save(SubscriptionImp object) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        try {

            EntityTransaction transaction = em.getTransaction();
            transaction.begin();

            em.persist(object);

            transaction.commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();

            logger.error("Error saving object: " + object.getClass().getSimpleName(), ex);
            throw ex;

        } finally {
            em.close();
        }

    }

    public void refresh(SubscriptionImp object) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        try {

            em.refresh(object);

        } finally {
            em.close();
        }

    }

    public SubscriptionImp getById(Long id) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        try {

            return em.find(SubscriptionImp.class, id);

        } finally {
            em.close();
        }

    }

    public void delete(SubscriptionImp object) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        try {

            EntityTransaction transaction = em.getTransaction();
            transaction.begin();

            em.remove(object);

            transaction.commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
            logger.error("Error deleting object: " + object.getClass().getSimpleName(), ex);
            throw ex;

        } finally {
            em.close();
        }

    }
}
