/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.StructureDesignPattern.BridgePattern.service;

/**
 *
 * @author chiry
 */
public abstract class Shape {
    protected DrawCircle drawcircle;
    protected Shape(DrawCircle draw){
        this.drawcircle =draw;
    }
    public abstract void draw();
    
}
