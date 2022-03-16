package oneToManyBi;

import oneToManyBi.entity.Department;
import oneToManyBi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(oneToManyBi.entity.Employee .class)
                .addAnnotatedClass(oneToManyBi.entity.Department.class)
                .buildSessionFactory();
        Session session = null;

        try {
            session = factory.getCurrentSession();
            Department department = new Department("IT", 500, 1500);
            Employee emp1 = new Employee("Maxim", "Vlasov", 800);
            Employee emp2 = new Employee("Nikita", "Ivanov", 950);

            department.addEmployeeToDepartment(emp1);
            department.addEmployeeToDepartment(emp2);


            session.beginTransaction();

            session.save(department); //Работники сохранятся сами, так как есть cascadeType.ALL
            session.getTransaction().commit();
        }
        finally {
            session.close();
            factory.close();
        }
    }
}
