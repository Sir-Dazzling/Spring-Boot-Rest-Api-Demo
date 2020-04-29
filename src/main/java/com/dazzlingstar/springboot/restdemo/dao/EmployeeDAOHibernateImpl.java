package com.dazzlingstar.springboot.restdemo.dao;

import com.dazzlingstar.springboot.restdemo.model.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO
{
    //Defining field for Entity Manager
    private EntityManager entityManager;

    //Setting up Constructor Injection
    @Autowired
    public EmployeeDAOHibernateImpl(EntityManager entityManager)
    {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Employee> findAll()
    {
        //Getting the current hibernate session
        Session currentSession = entityManager.unwrap(Session.class);

        //Creating a query
        Query<Employee> theQuery = currentSession.createQuery("from Employee", Employee.class);

        //Executing the query and getting the result list
        List<Employee> employees = theQuery.getResultList();

        //Returning the results
        return employees;
    }
}
