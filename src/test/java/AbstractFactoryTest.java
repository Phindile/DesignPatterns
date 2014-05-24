/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.phindile.DesignPatterns.AbstractFactory.AbstractCurrency;
import com.phindile.DesignPatterns.AbstractFactory.AbstractProducer;
import com.phindile.DesignPatterns.AbstractFactory.service.CurrencyService;
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
public class AbstractFactoryTest {
    
    public AbstractFactoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void TestAbstractFactory(){
        AbstractCurrency current = AbstractProducer.getCurrencyy("Currency");
        CurrencyService curr = current.getCurrencyType("$500");
        curr.getCurrency();
        CurrencyService curr2 = current.getCurrencyType("R500");
        curr2.getCurrency();
        
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
