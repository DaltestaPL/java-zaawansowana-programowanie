package org.company.repository;

import org.company.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {

    private static Long id = 0L;
    private static final List<Employee> employees = new ArrayList<>();

    public static Employee add(Employee employee) {
        id++;
        employee.setId(id);
        employees.add(employee);
        return employee;
    }

    public static void removeById(Long id) {
        var employee = employees.stream().filter(e -> e.getId().equals(id)).toList();
        employees.remove(employee.get(0));
    }

    public static Employee remove(Employee employee) {
        employees.remove(employee);
        return employee;
    }

    public static List<Employee> findAll() {
        return employees;
    }
}
