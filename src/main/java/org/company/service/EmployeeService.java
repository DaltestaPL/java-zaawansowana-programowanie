package org.company.service;

import org.company.model.Employee;
import org.company.repository.EmployeeRepository;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee addEmployee(Employee employee);
}
