/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.phindile.BehavioralPatterns.ChainOfResponsibility.MERCURY;
import com.phindile.BehavioralPatterns.ChainOfResponsibility.PlanetHandler;
import com.phindile.BehavioralPatterns.ChainOfResponsibility.Planetenum;
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
public class ChainTest {
    
    public ChainTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void TestChain()
    {
        PlanetHandler chain = setUpChain();
        chain.handleReguest(Planetenum.MERCURY);
    }
    public static PlanetHandler setUpChain(){
        PlanetHandler mercuryhander = new MERCURY();
        mercuryhander.setSuccesor(mercuryhander);
        
        return mercuryhander;
        
        
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
