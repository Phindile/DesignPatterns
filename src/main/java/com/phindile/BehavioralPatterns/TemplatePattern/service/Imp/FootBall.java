/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.BehavioralPatterns.TemplatePattern.service.Imp;

import com.phindile.BehavioralPatterns.TemplatePattern.Game;


/**
 *
 * @author chiry
 */
public class FootBall extends Game {

    @Override
    public void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    public void startPlay() {
        System.out.println("Football Game Start!");
    }

    @Override
    public void endPlay() {
      System.out.println("Football Game Finished!");
    }


   
    
}
