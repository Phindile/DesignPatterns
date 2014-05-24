/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.DesignPatterns.AbstractFactory.service.Imp;

import com.phindile.DesignPatterns.AbstractFactory.service.CurrencyService;

/**
 *
 * @author chiry
 */
public class Rands implements CurrencyService {

    @Override
    public void getCurrency() {
      System.out.println ("Amount is in Rands");
    }
    
}
