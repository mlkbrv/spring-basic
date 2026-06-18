package com.mlkbrv.hibernate_one_to_one;

import com.mlkbrv.hibernate_one_to_one.entity.Detail;
import com.mlkbrv.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();


//        Employee employee = new Employee("Emil","Akbarov","IT",500);
//        Detail detail = new Detail("Baku","123456789","emik@mail.ru");
//        employee.setDetail(detail);
//
//        session.beginTransaction();
//
//        session.save(employee);

        session.beginTransaction();

        Employee employee = session.get(Employee.class, 2);

        session.delete(employee);


        session.getTransaction().commit();
        sessionFactory.close();
        session.close();
    }
}
