package com.alevel.module03.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionUtil {
    private static final SessionFactory SESSION_FACTORY = new Configuration().configure().buildSessionFactory();

    private HibernateSessionUtil() {
        throw new UnsupportedOperationException();
    }

    public static SessionFactory getSessionFactory() {
        return SESSION_FACTORY;
    }
}
