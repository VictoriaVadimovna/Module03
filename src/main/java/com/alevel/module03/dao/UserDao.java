package com.alevel.module03.dao;

import com.alevel.module03.helper.HibernateSessionUtil;
import com.alevel.module03.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class UserDao {

    private SessionFactory sessionFactory = HibernateSessionUtil.getSessionFactory();

    public void createProduct(User user) {
        try (Session session = sessionFactory.openSession();) {
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        }
    }

    public User findById(int id) {
        try (Session session = sessionFactory.openSession()) {
            User user = session.get(User.class, id);
            if (user != null) {
            }
            return user;
        }
    }
    public void updateUser(int id) {
        try (Session session = sessionFactory.openSession()){
            session.beginTransaction();
            User user = session.get(User.class, id);
           Query<User> query = session.createQuery("UPDATE users " +
                   "SET full_name = ?, login = ?, email = ?, age = ?, is_author = ?, is_moderator = ?" +
                   "WHERE user_id = ?;");
            query.setParameter("newAge", user.getAge() + 1);
            query.setParameter("id", id);
            query.executeUpdate();
            session.getTransaction().commit();
        }
    }


}
