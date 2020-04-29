package com.dazzlingstar.springboot.restdemo.controllers;

import com.dazzlingstar.springboot.restdemo.model.Employee;
import com.dazzlingstar.springboot.restdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController
{
    private EmployeeService employeeService;

    //Injecting Employee DAO with constructor injection
    @Autowired
    public EmployeeRestController(EmployeeService employeeService)
    {
        this.employeeService = employeeService;
    }

    //Exposing "/employees" and returning the list of employees
    @GetMapping("/employees")
    public List<Employee> findAll()
    {
        return employeeService.findAll();
    }

    //Exposing "/employees/{employeeId} to return an employee
    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId)
    {
        Employee employee = employeeService.findById(employeeId);

        if(employee == null)
        {
            throw new RuntimeException("Employee Id not found - "+employeeId);
        }
        return employee;
    }
}
