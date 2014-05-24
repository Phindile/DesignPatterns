/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.phindile.BehavioralPatterns.CommandPattern.Stock;
import com.phindile.BehavioralPatterns.CommandPattern.service.Broker;
import com.phindile.BehavioralPatterns.CommandPattern.service.Imp.BuyStock;
import com.phindile.BehavioralPatterns.CommandPattern.service.Imp.SellStock;
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
public class TestCommandPattern {
    
    public TestCommandPattern() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void TestCommand()
    {
        Stock abcStock = new Stock();
        BuyStock buyStockOrder = new BuyStock(abcStock); 
        SellStock sellStockOrder = new SellStock(abcStock);
        Broker broker = new Broker(); 
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder); 
        broker.placeOrders();
        
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
