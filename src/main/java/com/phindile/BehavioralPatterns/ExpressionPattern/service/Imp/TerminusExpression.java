/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.BehavioralPatterns.ExpressionPattern.service.Imp;

import com.phindile.BehavioralPatterns.ExpressionPattern.service.Expression;

/**
 *
 * @author chiry
 */
public class TerminusExpression implements Expression {
    private String data;
    public TerminusExpression(String data){
        this.data = data;
    } 
@Override public boolean interpret(String context) {
if(context.contains(data)){ 
return true; }
return false;
}
    
}
