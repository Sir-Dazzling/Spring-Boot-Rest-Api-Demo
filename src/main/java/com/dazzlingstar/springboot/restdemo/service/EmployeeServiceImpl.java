package com.dazzlingstar.springboot.restdemo.service;

import com.dazzlingstar.springboot.restdemo.dao.EmployeeDAO;
import com.dazzlingstar.springboot.restdemo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
    //Defining field for Entity Manager
    private EmployeeDAO employeeDAO;

    //Setting up Constructor Injection
    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO)
    {
        this.employeeDAO = employeeDAO;
    }

    @Override
    @Transactional
    public List<Employee> findAll()
    {
        return employeeDAO.findAll();
    }

    @Override
    @Transactional
    public Employee findById(int id)
    {
        return employeeDAO.findById(id);
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee)
    {
        employeeDAO.saveEmployee(employee);
    }

    @Override
    @Transactional
    public void deleteEmployeeById(int id)
    {
        employeeDAO.deleteEmployeeById(id);
    }
}