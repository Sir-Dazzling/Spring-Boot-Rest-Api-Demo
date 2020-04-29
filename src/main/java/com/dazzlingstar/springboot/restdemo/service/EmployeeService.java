package com.dazzlingstar.springboot.restdemo.service;

import com.dazzlingstar.springboot.restdemo.model.Employee;

import java.util.List;

public interface EmployeeService
{
    List<Employee> findAll();

    Employee findById(int id);

    void saveEmployee(Employee employee);

    void deleteEmployeeById(int id);
}
