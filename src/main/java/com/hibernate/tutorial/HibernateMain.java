package com.hibernate.tutorial;

import org.hibernate.SessionFactory;

public class HibernateMain {

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    }
}
