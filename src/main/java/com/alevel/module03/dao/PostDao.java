package com.alevel.module03.dao;

import com.alevel.module03.helper.HibernateSessionUtil;
import com.alevel.module03.model.Post;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class PostDao {
    private SessionFactory sessionFactory = HibernateSessionUtil.getSessionFactory();

    public void createProduct(Post post) {
        try (Session session = sessionFactory.openSession();) {
            session.beginTransaction();
            session.save(post);
            session.getTransaction().commit();
        }
    }


}
