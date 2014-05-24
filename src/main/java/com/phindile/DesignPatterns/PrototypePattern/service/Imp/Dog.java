/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.DesignPatterns.PrototypePattern.service.Imp;

import com.phindile.DesignPatterns.PrototypePattern.service.Prototype;

/**
 *
 * @author chiry
 */
public class Dog implements Prototype{
  String name;
  public Dog(String name){
      this.name=name;
  }
    @Override
    public Prototype doClone() {
       return new Dog(name);
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
