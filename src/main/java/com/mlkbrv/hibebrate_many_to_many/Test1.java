package com.mlkbrv.hibebrate_many_to_many;

import com.mlkbrv.hibebrate_many_to_many.entity.Child;
import com.mlkbrv.hibebrate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = sessionFactory.getCurrentSession();

//            Section section = new  Section("Dance");
//
//            Child child = new Child("Mani",2);
//            Child child2 = new Child("Bil",12);
//            Child child3 = new Child("Butch",3);
//
//            section.addChild(child);
//            section.addChild(child2);
//            section.addChild(child3);


//            Section section1 = new Section("voleyball");
//            Section section2 = new Section("chess");
//            Section section3 = new Section("math");
//
//            Child child5 = new Child("Vindi",13);
//
//            child5.addSection(section1);
//            child5.addSection(section2);
//            child5.addSection(section3);

            session.beginTransaction();

//            Section section = session.get(Section.class, 1);
//
//            System.out.println(section);
//
//            System.out.println(section.getChildren());

//            Child child = session.get(Child.class, 5);
//
//            System.out.println(child);
//
//            System.out.println(child.getSections());

//            Section section = session.get(Section.class, 1);

//            Section section = session.get(Section.class, 8);
//
//            session.delete(section);

            Child child = session.get(Child.class, 5);

            session.delete(child);

            session.getTransaction().commit();
        }
        finally {
            session.close();
            sessionFactory.close();
        }
    }
}
