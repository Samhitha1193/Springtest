package com.springbasic.start.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.springbasic.start.service.EmployeeService;
import com.springbasic.start.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
public class MyController {

    private static final Logger logger = LogManager.getLogger(MyController.class);

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/hello")
    public String sayHello() {
        logger.debug("Hello from Log4j");
        return "hello";
    }

    @GetMapping(value = "/employees")
    public List<Employee> getEmployees() {
        logger.debug("get all the employees");
        return employeeService.getEmployees();
    }

    @PostMapping(value = "/saveEmployee")
    public Employee add(Employee employee) {
        logger.debug("save Employee");
        return employeeService.add(employee);
    }

    @PostMapping(value = "/removeEmployee")
    public void remove(Employee employee) {
        logger.debug("remove Employee");
        employeeService.remove(employee);
    }

    @PostMapping(value = "/updateEmployee")
    public Employee update(Employee employee) {
        logger.debug("update Employee");
        return employeeService.update(employee);
    }
}
