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
public class KeyBoard implements ComputerParts{

//    KeyBoard() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public void accept(ComputePartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
    
}
