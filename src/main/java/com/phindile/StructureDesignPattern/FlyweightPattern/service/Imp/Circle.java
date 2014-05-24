/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.StructureDesignPattern.FlyweightPattern.service.Imp;

import com.phindile.StructureDesignPattern.FlyweightPattern.service.Shape;

/**
 *
 * @author chiry
 */
public class Circle implements Shape {
    private String Color;
    private int x;
    private int y;
    private int radius;

    public Circle(String Color){
        this.Color=Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    @Override
    public void draw() {
       System.out.println("Circle: Draw() [Color : " + Color +", x : " + x +", y :" + y +", radius :" + radius);
    }
    
}
