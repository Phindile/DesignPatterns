/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.StructureDesignPattern.ProxyPattern.service.Imp;

import java.util.Date;

/**
 *
 * @author chiry
 */
public class Proxy {
    SlowThing slowthing;
    public Proxy()
    {
        System.out.println("Creating Proxy at"+new Date());
    }
    public void SayHallow()
    {
        if(slowthing==null){
            slowthing = new SlowThing();
        }
        slowthing.sayHello();
    }
    
}
