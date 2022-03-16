package oneToOne;

import oneToOne.entity.Detail;
import oneToOne.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(oneToOne.entity.Employee.class)
                .addAnnotatedClass(oneToOne.entity.Detail.class)
                .buildSessionFactory();
        Session session = null;

        try {
            session = factory.getCurrentSession();
            Employee employee = new Employee("Maxim", "Petrov", "HR", 300);
            Detail detail = new Detail("London", "+288313", "petrov@gmail.com");

            employee.setEmpDetail(detail);
            detail.setEmployee(employee);
            session.beginTransaction();
            session.save(detail);
        }
        finally {
            session.close();
            factory.close();
        }
    }
}
