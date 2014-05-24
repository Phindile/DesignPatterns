/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.BehavioralPatterns.ChainOfResponsibility;

/**
 *
 * @author chiry
 */
public abstract class PlanetHandler {
    PlanetHandler successor;

    public void setSuccesor(PlanetHandler succesor) {
        this.successor = succesor;
    }
    public abstract void handleReguest(Planetenum request);
    
}
