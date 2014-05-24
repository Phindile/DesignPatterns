/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.StructureDesignPattern.FlyweightPattern.service.Imp;

import com.phindile.StructureDesignPattern.FlyweightPattern.service.Shape;
import java.util.HashMap;

/**
 *
 * @author chiry
 */
public class ShapeFactory {
    private static final HashMap<String,Shape> circleMap = new HashMap();
    public static Shape getCircle(String color){
      Circle circle = (Circle)circleMap.get(color);
      if(circle == null) { circle = new Circle(color);
      circleMap.put(color, circle); System.out.println("Creating circle of color : " + color);
      }
      return circle;
    }
    
}
