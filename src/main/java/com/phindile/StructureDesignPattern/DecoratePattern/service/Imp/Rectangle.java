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
public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
    
}
