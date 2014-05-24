/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.DesignPatterns.FactoryPattern;

import com.phindile.DesignPatterns.FactoryPattern.service.BankTransaction;
import com.phindile.DesignPatterns.FactoryPattern.service.Imp.Deposit;
import com.phindile.DesignPatterns.FactoryPattern.service.Imp.Withdraw;

/**
 *
 * @author chiry
 */
public class BankTransactionFactory {
    
    public BankTransaction getTransaction(String type){
        if(type==null){
            return null;
        }else if(type.equalsIgnoreCase("Deposit")){
            return new Deposit();
        }else if(type.equalsIgnoreCase("Withdraw")){
            return new Withdraw();
        }else
        return null;
    }
     
    
}
