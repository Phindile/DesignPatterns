/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.phindile.BehavioralPatterns.SatatePattern.service.Imp.Context;
import com.phindile.BehavioralPatterns.SatatePattern.service.Imp.StartState;

import com.phindile.BehavioralPatterns.SatatePattern.service.Imp.StopState;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author chiry
 */
public class StateTest {
    
    public StateTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void TestState()
    {
        Context context = new Context();
        StartState startState = new StartState(); 
        startState.doAction(context);
        
        System.out.println(context.getState().toString()); 
        StopState stopState = new StopState(); 
        stopState.doAction(context); 
        System.out.println(context.getState().toString());
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
