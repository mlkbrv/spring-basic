package com.mlkbrv.hibernate_one_to_one;

import com.mlkbrv.hibernate_one_to_one.entity.Detail;
import com.mlkbrv.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        session.beginTransaction();


        Detail detail = session.get(Detail.class,4);

        session.delete(detail);

        session.getTransaction().commit();
        sessionFactory.close();
        session.close();
    }
}
