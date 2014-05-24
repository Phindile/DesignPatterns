/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.StructureDesignPattern.DecoratePattern.service.Imp;

import com.phindile.StructureDesignPattern.DecoratePattern.service.Shape;



/**
 *
 * @author chiry
 */
public abstract class ShapeDecorector implements Shape {
    protected Shape decoratedShape;
    public ShapeDecorector(Shape decoratedShape)
    { 
        this.decoratedShape = decoratedShape;
    
    }
    public void draw()
    { decoratedShape.draw();
    
    }
    
}
