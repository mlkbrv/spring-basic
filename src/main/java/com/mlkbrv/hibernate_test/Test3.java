package com.mlkbrv.hibernate_test;

import com.mlkbrv.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

//        Employee employee = session.get(Employee.class,1);
//        employee.setName("Xaliq");

        session.createQuery("update Employee set salary=1000 where name='Xaliq'").executeUpdate();

        session.getTransaction().commit();
        sessionFactory.close();
    }
}
