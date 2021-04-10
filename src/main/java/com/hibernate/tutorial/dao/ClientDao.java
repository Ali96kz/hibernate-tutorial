package com.hibernate.tutorial.dao;

import com.hibernate.tutorial.HibernateUtil;
import com.hibernate.tutorial.model.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class ClientDao {
    public Client insertOrUpdate(Client client) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.save(client);
        return client;
    }

    public void delete(Client client) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.delete(client);
    }

    public Client get(int id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        return session.load(Client.class, id);
    }

    public List<Client> getAll() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        String query = "select c from " + Client.class.getSimpleName() + " c";

        return (List<Client>) session.createQuery(query).list();
    }
}
