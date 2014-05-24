/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.StructureDesignPattern.CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chiry
 */
public class Employee {
    private String name;
    private String dept;
    private int salary; 
    private List<Employee> listemp;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        listemp = new ArrayList<Employee>();
    }
    public void addEmployee(Employee emp){
        listemp.add(emp);
    }
    public void removeEmployee(Employee emp){
        listemp.remove(emp);
    }
    public List<Employee> getAllEmployees(){
        return listemp;
    }   

    @Override
    public String toString() {
        return  "name=" + name + ", dept=" + dept + ", salary=" + salary + '}';
    }

   
}

