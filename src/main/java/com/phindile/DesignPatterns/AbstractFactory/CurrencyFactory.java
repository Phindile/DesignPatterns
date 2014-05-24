/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.DesignPatterns.AbstractFactory;

import com.phindile.DesignPatterns.AbstractFactory.service.CurrencyService;
import com.phindile.DesignPatterns.AbstractFactory.service.Imp.Dollars;
import com.phindile.DesignPatterns.AbstractFactory.service.Imp.Rands;

/**
 *
 * @author chiry
 */
public class CurrencyFactory extends AbstractCurrency{

    @Override
    public CurrencyService getCurrencyType(String typ) {
        
       if(typ==null){
           return null;
       }if(typ.contains("$")){
           
           return new Dollars();
       }else if(typ.contains("R")){
           return new Rands();
       }
           return null;
       }
    
}
