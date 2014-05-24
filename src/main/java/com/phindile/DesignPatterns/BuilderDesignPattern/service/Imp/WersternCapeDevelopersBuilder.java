package com.phindile.DesignPatterns.BuilderDesignPattern.service.Imp;


import com.phindile.DesignPatterns.BuilderDesignPattern.Developers;
import com.phindile.DesignPatterns.BuilderDesignPattern.service.DeveloperBuilder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chiry
 */
public class WersternCapeDevelopersBuilder implements DeveloperBuilder {
    private Developers developers;
    public WersternCapeDevelopersBuilder(){
        developers = new Developers();
    }

    @Override
    public void builName() {
        developers.setName("Phindile Ashington Mposwa");
    }

    @Override
    public void buildLevel() {
        developers.setLevel("Junior Developer");
       
    }

    @Override
    public void buildSalary() {
        developers.setSalary((float) 50000.00);
    }

    @Override
    public Developers getDeveloper() {
        return developers;
       
    }
    
}
