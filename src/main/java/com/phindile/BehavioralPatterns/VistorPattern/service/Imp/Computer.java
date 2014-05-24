/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.BehavioralPatterns.VistorPattern.service.Imp;

import com.phindile.BehavioralPatterns.VistorPattern.service.ComputePartVisitor;
import com.phindile.BehavioralPatterns.VistorPattern.service.ComputerParts;



/**
 *
 * @author chiry
 */
public class Computer implements ComputerParts{
    ComputerParts[] parts; public Computer(){
        parts = new ComputerParts[] {new KeyBoard()};
    }
    @Override
    public void accept(ComputePartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) { 
            parts[i].accept(computerPartVisitor);
        } 
       // computerPartVisitor.visit(this);
    }
    
}
