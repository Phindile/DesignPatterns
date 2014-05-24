/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.DesignPatterns.AbstractFactory;

/**
 *
 * @author chiry
 */
public class AbstractProducer {
    public static AbstractCurrency getCurrencyy(String choice){
        if(choice.equalsIgnoreCase("Currency")){
            return new CurrencyFactory();
        }else{
        return null;}
}
    
}
