package com.springbasic.start.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springbasic.start.model.Employee;
import com.springbasic.start.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public Employee add(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void remove(Employee employee) {
        employeeRepository.delete(employee);
    }

    public Employee update(Employee employee) {
        return employeeRepository.save(employee);
    }
}
