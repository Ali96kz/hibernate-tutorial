package com.hibernate.tutorial.dao;

import com.hibernate.tutorial.HibernateUtil;
import com.hibernate.tutorial.model.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class CategoryDao {

    public Category insertOrUpdate(Category category) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.save(category);
        return category;
    }

    public void delete(Category category) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.delete(category);
    }

    public Category get(int id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        return session.load(Category.class, id);
    }

    public List<Category> getAll() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        String query = "select c from " + Category.class.getSimpleName() + " c";

        return (List<Category>) session.createQuery(query).list();
    }
}
