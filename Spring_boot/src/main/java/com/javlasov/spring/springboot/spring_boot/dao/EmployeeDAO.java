package com.javlasov.spring.springboot.spring_boot.dao;

import com.javlasov.spring.springboot.spring_boot.entity.Employee;

import java.util.List;


public interface EmployeeDAO {

    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
