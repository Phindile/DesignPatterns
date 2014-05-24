/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.BehavioralPatterns.ObserverPattern;

/**
 *
 * @author chiry
 */
public class BinaryObserver extends Obsever{
    public BinaryObserver(Subject subject){ 
        this.subject = subject; 
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) );
    }
    
}
