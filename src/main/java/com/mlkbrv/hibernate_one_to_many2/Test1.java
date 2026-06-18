package com.mlkbrv.hibernate_one_to_many2;

import com.mlkbrv.hibernate_one_to_many2.entity.Department;
import com.mlkbrv.hibernate_one_to_many2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

//        Department department = new Department("HR",300,1200);
//
//        Employee e1 = new Employee("Bob","Smth",800);
//
//        Employee e2 = new Employee("John","Smith",1000);
//
//        department.addEmployee(e1);
//        department.addEmployee(e2);
//
//        session.save(department);

        Department department = session.get(Department.class, 2);

        System.out.println(department);
        System.out.println(department.getEmployees());

        session.getTransaction().commit();
        sessionFactory.close();
        session.close();
    }
}
