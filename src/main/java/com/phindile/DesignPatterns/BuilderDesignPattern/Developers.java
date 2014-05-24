/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.DesignPatterns.BuilderDesignPattern;

/**
 *
 * @author chiry
 */
public class Developers {
    
    private String name;
    private String level;
    private float salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Developers{" + "name=" + name + ", level=" + level + ", salary=" + salary + '}';
    }
    
    
}
