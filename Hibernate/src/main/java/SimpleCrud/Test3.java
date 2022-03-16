package SimpleCrud;

import SimpleCrud.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 Simple getting several Object from Database
 */

public class Test3 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            List<Employee> employeeList = session.createQuery("from hibernate.entity.Employee")
//                            .getResultList();
            List<Employee> employeeList = session.createQuery("from SimpleCrud.SimpleCRUD.entity.Employee " +
                            "where department = 'HR' AND salary = 400")
                            .getResultList();

            for (Employee employee : employeeList) {
                System.out.println(employee);
            }

            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
