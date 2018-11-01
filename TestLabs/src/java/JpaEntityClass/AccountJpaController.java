/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JpaEntityClass;

import EntityClass.Account;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import EntityClass.History;
import JpaEntityClass.exceptions.IllegalOrphanException;
import JpaEntityClass.exceptions.NonexistentEntityException;
import JpaEntityClass.exceptions.RollbackFailureException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.transaction.UserTransaction;

/**
 *
 * @author harit
 */
public class AccountJpaController implements Serializable {

    public AccountJpaController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Account account) throws RollbackFailureException, Exception {
        if (account.getHistoryCollection() == null) {
            account.setHistoryCollection(new ArrayList<History>());
        }
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Collection<History> attachedHistoryCollection = new ArrayList<History>();
            for (History historyCollectionHistoryToAttach : account.getHistoryCollection()) {
                historyCollectionHistoryToAttach = em.getReference(historyCollectionHistoryToAttach.getClass(), historyCollectionHistoryToAttach.getHistoryid());
                attachedHistoryCollection.add(historyCollectionHistoryToAttach);
            }
            account.setHistoryCollection(attachedHistoryCollection);
            em.persist(account);
            for (History historyCollectionHistory : account.getHistoryCollection()) {
                Account oldAccountidOfHistoryCollectionHistory = historyCollectionHistory.getAccountid();
                historyCollectionHistory.setAccountid(account);
                historyCollectionHistory = em.merge(historyCollectionHistory);
                if (oldAccountidOfHistoryCollectionHistory != null) {
                    oldAccountidOfHistoryCollectionHistory.getHistoryCollection().remove(historyCollectionHistory);
                    oldAccountidOfHistoryCollectionHistory = em.merge(oldAccountidOfHistoryCollectionHistory);
                }
            }
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Account account) throws IllegalOrphanException, NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Account persistentAccount = em.find(Account.class, account.getAccountid());
            Collection<History> historyCollectionOld = persistentAccount.getHistoryCollection();
            Collection<History> historyCollectionNew = account.getHistoryCollection();
            List<String> illegalOrphanMessages = null;
            for (History historyCollectionOldHistory : historyCollectionOld) {
                if (!historyCollectionNew.contains(historyCollectionOldHistory)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain History " + historyCollectionOldHistory + " since its accountid field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            Collection<History> attachedHistoryCollectionNew = new ArrayList<History>();
            for (History historyCollectionNewHistoryToAttach : historyCollectionNew) {
                historyCollectionNewHistoryToAttach = em.getReference(historyCollectionNewHistoryToAttach.getClass(), historyCollectionNewHistoryToAttach.getHistoryid());
                attachedHistoryCollectionNew.add(historyCollectionNewHistoryToAttach);
            }
            historyCollectionNew = attachedHistoryCollectionNew;
            account.setHistoryCollection(historyCollectionNew);
            account = em.merge(account);
            for (History historyCollectionNewHistory : historyCollectionNew) {
                if (!historyCollectionOld.contains(historyCollectionNewHistory)) {
                    Account oldAccountidOfHistoryCollectionNewHistory = historyCollectionNewHistory.getAccountid();
                    historyCollectionNewHistory.setAccountid(account);
                    historyCollectionNewHistory = em.merge(historyCollectionNewHistory);
                    if (oldAccountidOfHistoryCollectionNewHistory != null && !oldAccountidOfHistoryCollectionNewHistory.equals(account)) {
                        oldAccountidOfHistoryCollectionNewHistory.getHistoryCollection().remove(historyCollectionNewHistory);
                        oldAccountidOfHistoryCollectionNewHistory = em.merge(oldAccountidOfHistoryCollectionNewHistory);
                    }
                }
            }
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = account.getAccountid();
                if (findAccount(id) == null) {
                    throw new NonexistentEntityException("The account with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws IllegalOrphanException, NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Account account;
            try {
                account = em.getReference(Account.class, id);
                account.getAccountid();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The account with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            Collection<History> historyCollectionOrphanCheck = account.getHistoryCollection();
            for (History historyCollectionOrphanCheckHistory : historyCollectionOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Account (" + account + ") cannot be destroyed since the History " + historyCollectionOrphanCheckHistory + " in its historyCollection field has a non-nullable accountid field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            em.remove(account);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Account> findAccountEntities() {
        return findAccountEntities(true, -1, -1);
    }

    public List<Account> findAccountEntities(int maxResults, int firstResult) {
        return findAccountEntities(false, maxResults, firstResult);
    }

    private List<Account> findAccountEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Account.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Account findAccount(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Account.class, id);
        } finally {
            em.close();
        }
    }

    public int getAccountCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Account> rt = cq.from(Account.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
