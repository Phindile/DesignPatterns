/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.BehavioralPatterns.ChainOfResponsibility;

/**
 *
 * @author chiry
 */
public class MERCURY extends PlanetHandler{
    public void HadleRequest(Planetenum request){
        if(request==Planetenum.MERCURY)
        {
            System.out.println(" MERCURYHANDLER HANDLES"+request);
        }else{
            System.out.println(" MERCURYHANDLER Does not Handle"+request);
            if(successor !=null){
                successor.handleReguest(request);
            }
            
            
        }
    }

    @Override
    public void handleReguest(Planetenum request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
