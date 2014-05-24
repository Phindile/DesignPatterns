/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.StructureDesignPattern.adapterDesignPattern.service.concreteclasses;

import com.phindile.StructureDesignPattern.adapterDesignPattern.service.Account;
import com.phindile.StructureDesignPattern.adapterDesignPattern.service.AccountTypes;
import com.phindile.StructureDesignPattern.adapterDesignPattern.service.Imp.CheckAccountImp;
import com.phindile.StructureDesignPattern.adapterDesignPattern.service.Imp.SavingsAccountImp;

/**
 *
 * @author chiry
 */
public class AccountAdapter implements Account{
    
    AccountTypes Accounttype;
    
    public AccountAdapter(String AccType){
        if(AccType.equalsIgnoreCase("Savings")){
            Accounttype = new SavingsAccountImp();
        }else if(AccType.equalsIgnoreCase("Check")){
            Accounttype =new CheckAccountImp();
        }
    }

  

    @Override
    public void Account(String accountType, String Holdername) {
        if(accountType.equalsIgnoreCase("Savings")){
            Accounttype.SacingsAccount(Holdername);
        }else if(accountType.equalsIgnoreCase("Check")){
            Accounttype.CheckAccount(Holdername);
        }
        
    }
    
}
