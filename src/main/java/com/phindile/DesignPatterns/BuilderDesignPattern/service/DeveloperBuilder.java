/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.DesignPatterns.BuilderDesignPattern.service;

import com.phindile.DesignPatterns.BuilderDesignPattern.Developers;

/**
 *
 * @author chiry
 */
public interface DeveloperBuilder {
    public void builName();
    public void  buildLevel();
    public void buildSalary();
    
    public Developers getDeveloper();
    
}
