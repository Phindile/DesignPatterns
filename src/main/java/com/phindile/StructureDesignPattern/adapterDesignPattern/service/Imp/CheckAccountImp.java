/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.StructureDesignPattern.adapterDesignPattern.service.Imp;

import com.phindile.StructureDesignPattern.adapterDesignPattern.service.AccountTypes;

/**
 *
 * @author chiry
 */
public class CheckAccountImp implements AccountTypes {

    @Override
    public void SacingsAccount(String HolderName) {
     //
    }

    @Override
    public void CheckAccount(String HolderName) {
       System.out.println("Saving on Check Account"+HolderName);
    }
    
}
