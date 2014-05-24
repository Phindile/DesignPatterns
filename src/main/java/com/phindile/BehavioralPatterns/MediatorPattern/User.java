/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.BehavioralPatterns.MediatorPattern;

/**
 *
 * @author chiry
 */
public class User {
    private String name;

    public void setName(String Name) {
        this.name = Name;
    }

    public String getName() {
        return name;
    }
    
    public User(String name){
        this.name = name; 
    }
    public void sendMessage(String message){
        ChartRoom.showMessage(this,message); 
    }
    
}
