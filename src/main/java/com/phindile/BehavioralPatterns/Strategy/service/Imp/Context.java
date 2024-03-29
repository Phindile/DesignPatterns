/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.BehavioralPatterns.Strategy.service.Imp;

import com.phindile.BehavioralPatterns.Strategy.service.Strategy;

/**
 *
 * @author chiry
 */
public class Context {
    private Strategy strategy;
    
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public int executeStrategy(int num1, int num2){ 
        return strategy.doOperation(num1, num2);
    }
    
}
