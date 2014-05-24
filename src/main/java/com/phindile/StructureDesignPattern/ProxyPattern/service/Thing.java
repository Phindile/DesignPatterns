/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.StructureDesignPattern.ProxyPattern.service;

import java.util.Date;

/**
 *
 * @author chiry
 */
public abstract class Thing {
  public void sayHello(){
 System.out.println(this.getClass().getSimpleName()+"Says Pizzy "+new Date());

    } 
}
