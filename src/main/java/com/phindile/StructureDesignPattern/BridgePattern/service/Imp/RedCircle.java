/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.StructureDesignPattern.BridgePattern.service.Imp;

import com.phindile.StructureDesignPattern.BridgePattern.service.DrawCircle;

/**
 *
 * @author chiry
 */
public class RedCircle implements DrawCircle{
    

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius +", x: " +x+", "+ y +"]");
    }
    
}
