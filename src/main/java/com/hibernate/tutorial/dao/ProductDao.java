package com.hibernate.tutorial.dao;

import com.hibernate.tutorial.HibernateUtil;
import com.hibernate.tutorial.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class ProductDao {
    public Product insertOrUpdate(Product product) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.save(product);
        return product;
    }

    public void delete(Product product) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.delete(product);
    }

    public Product get(int id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        return session.load(Product.class, id);
    }

    public List<Product> getAll() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        String query = "select p from " + Product.class.getSimpleName() + " p";

        return (List<Product>) session.createQuery(query).list();
    }
}
