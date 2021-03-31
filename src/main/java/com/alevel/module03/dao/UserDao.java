package com.alevel.module03.dao;

import com.alevel.module03.helper.HibernateSessionUtil;
import com.alevel.module03.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class UserDao {

    private SessionFactory sessionFactory = HibernateSessionUtil.getSessionFactory();

    public void createUser(User user) {
        if(user.getAge() >= 18 && user.getEmail().contains("@")) {
            try (Session session = sessionFactory.openSession();) {
                session.beginTransaction();
                session.save(user);
                session.getTransaction().commit();
            }
        }
    }

    public User findById(int id) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Query query = session.createQuery("  FROM  User where id =: userId");
            query.setParameter("userId", id);
            User user = (User) query.getSingleResult();
            session.getTransaction().commit();
            return user;
        }
    }

    public void updateUser(User user, int id) {
        try (Session session = sessionFactory.openSession()){
            session.beginTransaction();
           Query query = session.createQuery("UPDATE users " +
                   "SET full_name =: full_name, " +
                           "login =: login, " +
                           "email =: email, " +
                           "age =: age, " +
                           "is_author =: is_author, " +
                           "is_moderator =: is_moderator, " +
                           "WHERE user_id =: id" +
                           ");") ;
            query.setParameter("full_name", user.getFullName());
            ;
            query.setParameter("login", user.getLogin());
            ;
            query.setParameter("email", user.getEmail());
            ;
            query.setParameter("age", user.getAge());
            ;
            query.setParameter("is_author", user.getAuthor());
            ;
            query.setParameter("is_moderator", user.getModerator());
            ;
            query.setParameter("userId", id);
            int rows = query.executeUpdate();
            session.getTransaction().commit();

        }
    }


}
