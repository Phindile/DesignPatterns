/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.DesignPatterns.FactoryPattern.service.Imp;

import com.phindile.DesignPatterns.FactoryPattern.service.BankTransaction;

/**
 *
 * @author chiry
 */
public class Deposit implements BankTransaction {

    @Override
    public void getTransaction() {
        System.out.println ("DepositTransaction");
    }
    
}
