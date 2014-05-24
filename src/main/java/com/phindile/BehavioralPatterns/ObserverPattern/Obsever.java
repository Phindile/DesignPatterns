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
public abstract class Obsever {
    protected Subject subject;
    public abstract void update();
    
}
