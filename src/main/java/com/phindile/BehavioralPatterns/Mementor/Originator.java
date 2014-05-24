/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.phindile.BehavioralPatterns.Mementor;

/**
 *
 * @author chiry
 */
public class Originator {
    private String State;

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }
    
    public Memento saveStateToMemento(){
        return new Memento(State);
    }
    public void getStateFromMemento(Memento Memento){
        State = Memento.getState(); 
    }
    
}
