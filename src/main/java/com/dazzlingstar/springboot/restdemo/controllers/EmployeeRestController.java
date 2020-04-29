package com.dazzlingstar.springboot.restdemo.controllers;

import com.dazzlingstar.springboot.restdemo.dao.EmployeeDAO;
import com.dazzlingstar.springboot.restdemo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController
{
    private EmployeeDAO employeeDAO;

    //Injecting Employee DAO with constructor injection
    @Autowired
    public EmployeeRestController(EmployeeDAO employeeDAO)
    {
        this.employeeDAO = employeeDAO;
    }

    //Exposing "/employees" and returning the list of employees
    @GetMapping("/employees")
    public List<Employee> findAll()
    {
        return employeeDAO.findAll();
    }
}
