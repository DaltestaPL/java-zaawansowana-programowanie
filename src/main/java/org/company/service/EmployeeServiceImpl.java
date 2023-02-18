package org.company.service;

import org.company.model.Employee;
import org.company.repository.EmployeeRepository;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<Employee> getAllEmployees() {
        return EmployeeRepository.findAll();
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return EmployeeRepository.add(employee);
    }
}
