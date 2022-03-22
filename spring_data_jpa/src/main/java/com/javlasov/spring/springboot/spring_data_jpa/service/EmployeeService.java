package com.javlasov.spring.springboot.spring_data_jpa.service;

import com.javlasov.spring.springboot.spring_data_jpa.entity.Employee;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    @Transactional
    void deleteEmployee(int id);

}
