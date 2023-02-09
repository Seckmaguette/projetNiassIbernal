package service;

import model.Medecin;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

import java.util.List;

public class MedecinService implements IMedecin {
    private Session session;

    public MedecinService() {
        session = HibernateUtil.getSession();
    }

    @Override
    public void save(Medecin medecin) {
        Transaction tx = session.getTransaction();
        try {
            tx.begin();
            session.save(medecin);
            tx.commit();
        }catch (Exception e){
            tx.rollback();
            throw e;
        }
    }

    @Override
    public List<Medecin> findAll() {
        return session.createQuery("SELECT m FROM Medecin m",Medecin.class).list();
    }
}
