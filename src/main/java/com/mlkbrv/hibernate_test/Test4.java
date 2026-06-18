package com.mlkbrv.hibernate_test;

import com.mlkbrv.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

//        Employee employee = (Employee) session.get(Employee.class, 1);
//        session.delete(employee);

        session.createQuery("delete Employee where name='Xaliq'").executeUpdate();

        session.getTransaction().commit();
        sessionFactory.close();
    }
}
