package com.mlkbrv.hibernate_test;

import com.mlkbrv.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Employee employee = new Employee("Emil","Akbarov","IT",1000);
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
        sessionFactory.close();
    }
}
