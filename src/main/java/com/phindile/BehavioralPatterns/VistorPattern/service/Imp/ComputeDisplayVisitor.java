/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.BehavioralPatterns.VistorPattern.service.Imp;


import com.phindile.BehavioralPatterns.VistorPattern.service.ComputePartVisitor;

/**
 *
 * @author chiry
 */
public class ComputeDisplayVisitor implements ComputePartVisitor{

    @Override
    public void visit(KeyBoard keyboard) {
      System.out.println("Displaying Keyboard.");
    }

//    @Override
//    public void visit(Computer aThis) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
}
