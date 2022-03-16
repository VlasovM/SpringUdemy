package SimpleCrud;

import SimpleCrud.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 Simple delete Object in DB by department
 */

public class Test5 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            session.createQuery("delete Employee where department = 'HR'").executeUpdate();
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
