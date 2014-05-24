/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.DesignPatterns.BuilderDesignPattern;

import com.phindile.DesignPatterns.BuilderDesignPattern.service.DeveloperBuilder;

/**
 *
 * @author chiry
 */
public class DevelopmentDirector {
    private DeveloperBuilder developerbuilder = null;
    
    public DevelopmentDirector(DeveloperBuilder developerbuilder){
        this.developerbuilder =developerbuilder;
    }
    public void constructDevelopers(){
        developerbuilder.builName();
        developerbuilder.buildLevel();
        developerbuilder.buildSalary();
    }
    public Developers getDeveloper(){
        return developerbuilder.getDeveloper();
    }
    
}
