package service;

import model.Service;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateUtil;

import java.util.List;

public class ServiceService extends AbstractFacade<Service> implements IService {
    private Session session;

    public ServiceService()
    {
        super(Service.class);

        session = HibernateUtil.getSession();
    }


    @Override
    public Session getSession() {
        return session;
    }
}