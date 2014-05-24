/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.DesignPatterns.AbstractFactory;

import com.phindile.DesignPatterns.AbstractFactory.service.CurrencyService;

/**
 *
 * @author chiry
 */
public abstract class AbstractCurrency {
    public abstract CurrencyService getCurrencyType(String typ);  
}
