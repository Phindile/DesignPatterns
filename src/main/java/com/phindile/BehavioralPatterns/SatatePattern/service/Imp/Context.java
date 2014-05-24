/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.BehavioralPatterns.SatatePattern.service.Imp;

import com.phindile.BehavioralPatterns.SatatePattern.service.State;
import com.phindile.BehavioralPatterns.Strategy.service.Imp.Add;

/**
 *
 * @author chiry
 */
public class Context {
    private State state;
    
    public Context(){
        state = null; 
    }

    public Context(Add add) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    public void setState(State state){ 
        this.state = state;
    } 
    public State getState(){ 
        return state; 
    }

//    void setState(StopState aThis) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public String executeStrategy(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
