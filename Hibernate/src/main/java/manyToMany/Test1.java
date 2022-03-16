package manyToMany;

import manyToMany.entity.Child;
import manyToMany.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(manyToMany.entity.Child.class)
                .addAnnotatedClass(manyToMany.entity.Section.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = factory.getCurrentSession();

            session.beginTransaction();

            Section section = session.get(Section.class, 1);
            session.delete(section);

            session.getTransaction().commit();



//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Football");
//            Child child1 = new Child("Maxim", 5);
//            Child child2 = new Child("Ivan", 6);
//            Child child3 = new Child("Petr", 7);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.save(section1);
//
//            session.getTransaction().commit();

        } finally {
            session.close();
            factory.close();
        }

    }
}
