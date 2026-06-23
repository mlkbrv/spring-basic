package com.mlkbrv.hibernate_one_to_many;

import com.mlkbrv.hibernate_one_to_many.entity.Department;
import com.mlkbrv.hibernate_one_to_many.entity.Employee;
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

//        Department department = new Department("IT",300,1200);
//
//        Employee e1 = new Employee("Bob","Smth",800);
//
//        Employee e2 = new Employee("John","Smith",1000);
//
//        department.addEmployee(e1);
//        department.addEmployee(e2);
//
//        session.save(department);

//        Department department = session.get(Department.class, 1);
//
//        List<Employee> employees = department.getEmployees();
//
//        for (Employee employee : employees) {
//            System.out.println(employee);
//        }

        System.out.println("Get department");
        Department department = session.get(Department.class, 3);

        System.out.println("Show department");
        System.out.println(department);

        System.out.println("Get employee");
        System.out.println(department.getEmployees());




        session.getTransaction().commit();
        sessionFactory.close();
        session.close();
    }
}
