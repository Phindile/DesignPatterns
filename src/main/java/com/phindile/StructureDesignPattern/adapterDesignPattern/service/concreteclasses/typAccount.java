/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.StructureDesignPattern.adapterDesignPattern.service.concreteclasses;

import com.phindile.StructureDesignPattern.adapterDesignPattern.service.Account;

/**
 *
 * @author chiry
 */
public class typAccount implements Account{
    AccountAdapter accountadapter;
    

    @Override
    public void Account(String accountType, String Holdername) {
       if(accountType.equalsIgnoreCase("Savings")){
           System.out.println("Saving on Savings For. Name: "+Holdername);
       }else if(accountType.equalsIgnoreCase("Check")){
           System.out.println("Saving on Check Account for Name:"+Holdername);
       }
    }
    
}
