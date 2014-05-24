/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.phindile.BehavioralPatterns.Mementor.CarTaker;
import com.phindile.BehavioralPatterns.Mementor.Originator;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author chiry
 */
public class MementoTest {
    
    public MementoTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void MementoTest()
    {
        Originator originator = new Originator(); 
        CarTaker careTaker = new CarTaker(); 
        originator.setState("State #1");
        originator.setState("State #2"); 
        careTaker.add(originator.saveStateToMemento()); 
        originator.setState("State #3"); 
        careTaker.add(originator.saveStateToMemento()); 
        originator.setState("State #4");
        System.out.println("Current State: " + originator.getState());

    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
