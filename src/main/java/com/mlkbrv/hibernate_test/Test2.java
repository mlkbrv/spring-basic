package com.mlkbrv.hibernate_test;

import com.mlkbrv.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

//        List<Employee> list = session.createQuery("from Employee").getResultList();

        List<Employee> list = session.createQuery("from Employee "
        +"where name = 'Xaliq' AND salary>300").getResultList();

        for (Employee employee : list) {
            System.out.println(employee);
        }

        session.getTransaction().commit();
        sessionFactory.close();
    }
}
