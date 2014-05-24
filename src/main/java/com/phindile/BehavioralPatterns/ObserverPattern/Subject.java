/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.BehavioralPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chiry
 */
public class Subject {
    private List<Obsever> observers = new ArrayList<Obsever>(); 
    private int state; 
    public int getState()
    { return state;
    
    }
    public void setState(int state) { 
        this.state = state;
    notifyAllObservers();
    }
    public void attach(Obsever observer){ 
        observers.add(observer);
    }
    public void notifyAllObservers(){ 
        for (Obsever observer : observers) { 
            observer.update();
    } 
    }
    
}
