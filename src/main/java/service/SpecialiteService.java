package service;

import model.Specialite;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

import java.util.List;

public class SpecialiteService implements ISpecialite {
    private Session session;

    public SpecialiteService() {
        session = HibernateUtil.getSession();
    }

    @Override
    public void save(Specialite specialite) {
        Transaction tx = session.getTransaction();
        try {
            tx.begin();
            session.save(specialite);
            tx.commit();
        }catch (Exception e){
            tx.rollback();
            throw e;
        }
    }

    @Override
    public List<Specialite> findAll() {
        return session.createQuery("SELECT sp FROM Specialite sp",Specialite.class).list();
    }

    @Override
    public Specialite findById(long id) {
        return session.createQuery("SELECT sp FROM Specialite sp where sp.id = :id",Specialite.class)
                .setParameter("id",id)
                .getSingleResult();
    }
}
