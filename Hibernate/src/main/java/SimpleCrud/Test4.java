package SimpleCrud;

import SimpleCrud.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 Simple update several values Object in DB
 */

public class Test4 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            session.createQuery("update Employee set salary = 1000").executeUpdate();

            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
