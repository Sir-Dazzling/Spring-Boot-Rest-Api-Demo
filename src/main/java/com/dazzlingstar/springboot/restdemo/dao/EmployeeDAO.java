package com.dazzlingstar.springboot.restdemo.dao;

import com.dazzlingstar.springboot.restdemo.model.Employee;

import java.util.List;

public interface EmployeeDAO
{
    List<Employee> findAll();
}
