/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.BehavioralPatterns.VistorPattern.service;

/**
 *
 * @author chiry
 */
public interface ComputerParts {
   public void accept(ComputePartVisitor computerPartVisitor); 
    
}
