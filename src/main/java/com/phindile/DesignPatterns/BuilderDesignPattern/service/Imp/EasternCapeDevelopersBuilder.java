/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.DesignPatterns.BuilderDesignPattern.service.Imp;

import com.phindile.DesignPatterns.BuilderDesignPattern.Developers;
import com.phindile.DesignPatterns.BuilderDesignPattern.service.DeveloperBuilder;

/**
 *
 * @author chiry
 */
public class EasternCapeDevelopersBuilder implements DeveloperBuilder{
    
    private Developers developers;
    
    public EasternCapeDevelopersBuilder(){
        developers = new Developers();
    }

    @Override
    public void builName() {
        developers.setName("ANDA JUNIOR MPOSWA");
        
    }

    @Override
    public void buildLevel() {
        developers.setLevel("JUNIOR DEVELOPER");
        
    }

    @Override
    public void buildSalary() {
        developers.setSalary((float)17000.00);
       
    }

    @Override
    public Developers getDeveloper() {
        return developers;
    }
    
}
