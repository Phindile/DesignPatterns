/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.BehavioralPatterns.SatatePattern.service;

import com.phindile.BehavioralPatterns.SatatePattern.service.Imp.Context;

/**
 *
 * @author chiry
 */
public interface State {
    public void doAction(Context context);
    
}
