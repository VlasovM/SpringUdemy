package com.javlasov.spring.rest;

import com.javlasov.spring.entity.Employee;
import com.javlasov.spring.rest.configuration.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext configApplicationContext =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = configApplicationContext.getBean("communication", Communication.class);
//        Employee employee = communication.getEmployee(2);
//        System.out.println(employee);

//        Employee employee = new Employee("Boris", "Petrov", "HR", 900);
//        communication.saveEmployee(employee);

        communication.deleteEmployee(9);
    }
}
