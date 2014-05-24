/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.StructureDesignPattern.BridgePattern.service.Imp;

import com.phindile.StructureDesignPattern.BridgePattern.service.DrawCircle;
import com.phindile.StructureDesignPattern.BridgePattern.service.Shape;

/**
 *
 * @author chiry
 */
public class Circle extends Shape{
    private int x, y, radius;
    
    public Circle(int x, int y, int radius, DrawCircle drawcircle) {
    super(drawcircle);
    this.x = x;
    this.y = y; 
    this.radius = radius;
    }

    @Override
    public void draw() {
        drawcircle.drawCircle(radius, x, y);
    }
    
}
