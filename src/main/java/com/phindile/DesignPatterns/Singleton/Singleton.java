/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.DesignPatterns.Singleton;

/**
 *
 * @author chiry
 */
public class Singleton {
    
    private static Singleton singletonexample = null;
    private Singleton(){
    }
    public static Singleton getInstance(){
          if(singletonexample==null){
            singletonexample = new Singleton();
            }
            return singletonexample;   
        }
        public String getMessage(){
          return  "Hellow";
        }
    
    
}
