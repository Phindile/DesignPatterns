/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.BehavioralPatterns.VistorPattern.service;

import com.phindile.BehavioralPatterns.VistorPattern.service.Imp.Computer;
import com.phindile.BehavioralPatterns.VistorPattern.service.Imp.KeyBoard;

/**
 *
 * @author chiry
 */
public interface ComputePartVisitor {
    public void visit(KeyBoard keyboard);   
}
