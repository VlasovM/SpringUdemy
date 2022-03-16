package oneToManyUni;

import oneToManyUni.entity.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(oneToManyUni.entity.Employee .class)
                .addAnnotatedClass(oneToManyUni.entity.Department.class)
                .buildSessionFactory();
        Session session = null;

        try {
            session = factory.getCurrentSession();
//            Department department = new Department("HR", 400, 1300);
//            Employee emp1 = new Employee("Ivan", "Petrov", 800);
//            Employee emp2 = new Employee("Maxim", "Ivanov", 400);
//
//            department.addEmployeeToDepartment(emp1);
//            department.addEmployeeToDepartment(emp2);
            session.beginTransaction();
            Department department = session.get(Department.class, 2);
            System.out.println(department);
            System.out.println(department.getEmployeeList());
//            session.save(department); //Работники сохранятся сами, так как есть cascadeType.ALL
            session.getTransaction().commit();
        }
        finally {
            session.close();
            factory.close();
        }
    }
}
